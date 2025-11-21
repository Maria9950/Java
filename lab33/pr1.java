package lab33;

import java.util.Formatter;
import java.util.Date;

public class pr1 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        boolean flag = true;
        char letter = 'A';
        int number = 255;
        double pi = Math.PI;
        String text = "Hello";
        Date now = new Date();

        // %b — логическое значение аргумента
        fmt.format("1) Логическое значение: %b%n", flag);

        // %c — символ
        fmt.format("2) Символ: %c%n", letter);

        // %d — десятичное целое
        fmt.format("3) Десятичное число: %d%n", number);

        // %f — число с плавающей точкой
        fmt.format("4) Число π с точностью до 3 знаков: %.3f%n", pi);

        // %s — строка
        fmt.format("5) Строка: %s%n", text);

        // Дополнительно: %t — дата/время
        fmt.format("6) Текущая дата: %tF%n", now);

        // Дополнительно: %% — символ процента
        fmt.format("7) Символ процента: %%");

        System.out.println(fmt.toString());
        fmt.close();
    }
}
