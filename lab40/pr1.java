package lab40;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class pr1 {
    public static void main(String[] args) {
        // будем читать байты из файла input.txt
        try (InputStream in = new FileInputStream("input.txt")) {

            int b; // сюда будет попадать очередной считанный байт

            while ((b = in.read()) != -1) {
                // преобразуем байт в символ и выводим
                char c = (char) b;
                System.out.print(c);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
