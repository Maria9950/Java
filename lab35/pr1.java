package lab35;

public class pr1 {
    public static void main(String[] args) {
        // 1) Исключение перехватывается
        try {
            int a = 10;
            int b = 0;
            int c = a / b;                    // ArithmeticException
            System.out.println("Результат: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Поймали ArithmeticException: " + e.getMessage());
        }

        System.out.println("После обработанного исключения");

        // 2) Исключение НЕ перехватывается -> программа аварийно завершится
        int[] arr = {1, 2, 3};
        System.out.println(arr[10]);          // ArrayIndexOutOfBoundsException (не обрабатываем)
        
        System.out.println("Эта строка уже не выполнится");
    }
}
