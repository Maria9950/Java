package lab3;
public class pr7 {
    public static void main(String[] args) {
        int a = 120;

        // byte b = a + 10;
        // Ошибка: выражение (a + 10) имеет тип int, а int нельзя неявно присвоить переменной типа byte.

        // Используем явное приведение
        byte c = (byte)(a + 10);

        // Переменная d с выражением, которое не выходит за пределы byte
        byte d = (byte)(a + 1);
        // 120 + 1 = 121 — значение в диапазоне byte > d = 121

        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // b ошибка компиляции 
        // c = -126, потому что при явном приведении int>byte произошло переполнение.
        // d = 121, потому что значение находится в допустимом диапазоне
    }
}
