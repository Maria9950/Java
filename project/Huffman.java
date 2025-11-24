package project;

import java.io.*;
import java.util.*;

public class Huffman {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Использование:");
            System.out.println("  encode: java Huffman encode <input> <output>");
            System.out.println("  decode: java Huffman decode <input> <output>");
            return;
        }

        String mode = args[0];
        String input = args[1];
        String output = args[2];

        try {
            if ("encode".equalsIgnoreCase(mode)) {
                encode(input, output);
            } else if ("decode".equalsIgnoreCase(mode)) {
                decode(input, output);
            } else {
                System.out.println("Неизвестный режим: " + mode);
            }
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static class Node implements Comparable<Node> {
        final int freq;
        final Byte value;
        final Node left;
        final Node right;
        final int order;

        private static int globalOrder = 0;

        Node(int freq, Byte value, Node left, Node right) {
            this.freq = freq;
            this.value = value;
            this.left = left;
            this.right = right;
            this.order = globalOrder++;
        }

        boolean isLeaf() {
            return value != null;
        }

        @Override
        public int compareTo(Node o) {
            if (this.freq != o.freq) {
                return Integer.compare(this.freq, o.freq);
            }
            return Integer.compare(this.order, o.order);
        }
    }

    private static class BitOutputStream implements Closeable {
        private final OutputStream out;
        private int currentByte = 0;
        private int numBitsFilled = 0;

        BitOutputStream(OutputStream out) {
            this.out = out;
        }

        void writeBit(int bit) throws IOException {
            currentByte = (currentByte << 1) | (bit & 1);
            numBitsFilled++;
            if (numBitsFilled == 8) {
                out.write(currentByte);
                numBitsFilled = 0;
                currentByte = 0;
            }
        }

        void writeBits(String bits) throws IOException {
            for (int i = 0; i < bits.length(); i++) {
                char c = bits.charAt(i);
                if (c == '0') writeBit(0);
                else if (c == '1') writeBit(1);
                else throw new IllegalArgumentException("Код содержит не 0/1: " + c);
            }
        }

        @Override
        public void close() throws IOException {
            if (numBitsFilled > 0) {
                currentByte <<= (8 - numBitsFilled);
                out.write(currentByte);
            }
            out.close();
        }
    }

    private static class BitInputStream implements Closeable {
        private final InputStream in;
        private int currentByte = 0;
        private int numBitsRemaining = 0;

        BitInputStream(InputStream in) {
            this.in = in;
        }

        int readBit() throws IOException {
            if (numBitsRemaining == 0) {
                currentByte = in.read();
                if (currentByte == -1) {
                    return -1;
                }
                numBitsRemaining = 8;
            }
            int bit = (currentByte >> 7) & 1;
            currentByte <<= 1;
            numBitsRemaining--;
            return bit;
        }

        @Override
        public void close() throws IOException {
            in.close();
        }
    }

    private static void encode(String inputFile, String outputFile) throws IOException {
        byte[] data = readAllBytes(inputFile);
        if (data.length == 0) {
            try (DataOutputStream out = new DataOutputStream(
                    new BufferedOutputStream(new FileOutputStream(outputFile)))) {
                writeHeaderForEmpty(out);
            }
            return;
        }

        int[] freq = new int[256];
        for (byte b : data) {
            freq[b & 0xFF]++;
        }

        Node root = buildTree(freq);
        Map<Byte, String> codeTable = buildCodeTable(root);

        try (DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(outputFile)))) {

            writeHeader(out, freq, data.length);

            BitOutputStream bitOut = new BitOutputStream(out);
            for (byte b : data) {
                String code = codeTable.get(b);
                bitOut.writeBits(code);
            }
            bitOut.close();
        }
    }

    private static byte[] readAllBytes(String path) throws IOException {
        try (InputStream in = new BufferedInputStream(new FileInputStream(path));
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buf = new byte[4096];
            int read;
            while ((read = in.read(buf)) != -1) {
                bos.write(buf, 0, read);
            }
            return bos.toByteArray();
        }
    }

    private static Node buildTree(int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                pq.add(new Node(freq[i], (byte) i, null, null));
            }
        }

        if (pq.size() == 1) {
            Node only = pq.poll();
            pq.add(new Node(only.freq, null, only, null));
        }

        while (pq.size() > 1) {
            Node n1 = pq.poll();
            Node n2 = pq.poll();
            Node parent = new Node(n1.freq + n2.freq, null, n1, n2);
            pq.add(parent);
        }

        return pq.poll();
    }

    private static Map<Byte, String> buildCodeTable(Node root) {
        Map<Byte, String> table = new HashMap<>();
        buildCodeRec(root, "", table);
        return table;
    }

    private static void buildCodeRec(Node node, String prefix, Map<Byte, String> table) {
        if (node.isLeaf()) {
            table.put(node.value, prefix.isEmpty() ? "0" : prefix);
        } else {
            buildCodeRec(node.left, prefix + "0", table);
            if (node.right != null) {
                buildCodeRec(node.right, prefix + "1", table);
            }
        }
    }

    private static void writeHeader(DataOutputStream out, int[] freq, int originalLength) throws IOException {
        out.writeByte('H');
        out.writeByte('F');
        out.writeByte('M');
        out.writeByte('N');

        out.writeInt(originalLength);

        int distinct = 0;
        for (int f : freq) if (f > 0) distinct++;
        out.writeInt(distinct);

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                out.writeByte(i);
                out.writeInt(freq[i]);
            }
        }
    }

    private static void writeHeaderForEmpty(DataOutputStream out) throws IOException {
        out.writeByte('H');
        out.writeByte('F');
        out.writeByte('M');
        out.writeByte('N');
        out.writeInt(0);
        out.writeInt(0);
    }

    private static void decode(String inputFile, String outputFile) throws IOException {
        try (DataInputStream in = new DataInputStream(
                new BufferedInputStream(new FileInputStream(inputFile)))) {

            if (in.readByte() != 'H' ||
                in.readByte() != 'F' ||
                in.readByte() != 'M' ||
                in.readByte() != 'N') {
                throw new IOException("Неверный формат файла (нет сигнатуры HFMN)");
            }

            int originalLength = in.readInt();
            int distinct = in.readInt();

            if (originalLength == 0) {
                try (OutputStream out = new FileOutputStream(outputFile)) {
                }
                return;
            }

            int[] freq = new int[256];
            for (int i = 0; i < distinct; i++) {
                int symbol = in.readUnsignedByte();
                int f = in.readInt();
                freq[symbol] = f;
            }

            Node root = buildTree(freq);

            try (OutputStream out = new BufferedOutputStream(new FileOutputStream(outputFile));
                 BitInputStream bitIn = new BitInputStream(in)) {

                int written = 0;
                Node current = root;

                while (written < originalLength) {
                    int bit = bitIn.readBit();
                    if (bit == -1) {
                        throw new EOFException("Неожиданный конец данных при декодировании");
                    }
                    current = (bit == 0) ? current.left : current.right;
                    if (current.isLeaf()) {
                        out.write(current.value);
                        written++;
                        current = root;
                    }
                }
            }
        }
    }
}
