package lab40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class pr2 {
    public static void main(String[] args) {
        try (OutputStream out = new FileOutputStream("output.txt")) {

            // Записываем один байт — букву 'A'
            out.write(65);       // 65 = 'A'

            // Записываем перенос строки для удобства
            out.write('\n');

            // Записываем ещё один байт — букву 'B'
            out.write(66);       // 66 = 'B'

            System.out.println("Запись завершена.");

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}
