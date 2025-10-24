package lab3;
public class pr1 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 0;

        short s1 = 1000;
        short s2 = 0;

        int i1 = 50000;
        int i2 = 0;

        long l1 = 10000000000L;
        long l2 = 0L;

        float f1 = 3.14f;
        float f2 = 0.0f;

        double d1 = 2.71828;
        double d2 = 0.0;

        char c1 = 'A';
        char c2 = '\u0000';

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("byte: " + b1 + ", нулевое значение: " + b2);
        System.out.println("short: " + s1 + ", нулевое значение: " + s2);
        System.out.println("int: " + i1 + ", нулевое значение: " + i2);
        System.out.println("long: " + l1 + ", нулевое значение: " + l2);
        System.out.println("float: " + f1 + ", нулевое значение: " + f2);
        System.out.println("double: " + d1 + ", нулевое значение: " + d2);
        System.out.println("char: " + c1 + ", нулевое значение: [" + c2 + "]");
        System.out.println("boolean: " + bool1 + ", нулевое значение: " + bool2);
    }
}
