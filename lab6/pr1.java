public class pr1 {
    public static void main(String[] args) {

        // Десятичное число
        Integer dec = Integer.decode("100");
        System.out.println("Десятичное значение: " + dec); // 100

        // Восьмеричное число (начинается с 0)
        Integer oct = Integer.decode("012");
        System.out.println("Восьмеричное значение: " + oct); // 10

        // Шестнадцатеричное число (начинается с 0x или 0X)
        Integer hex1 = Integer.decode("0xA");
        Integer hex2 = Integer.decode("0XFF");
        System.out.println("Шестнадцатеричные значения: " + hex1 + ", " + hex2); // 10, 255

        // Отрицательное значение
        Integer neg = Integer.decode("-0x10");
        System.out.println("Отрицательное значение: " + neg); // -16

        // Пример с Long
        Long longValue = Long.decode("0x1F");
        System.out.println("Значение типа Long: " + longValue); // 31
    }
}
