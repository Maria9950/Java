public class pr1 {
    public static void main(String[] args) {
        // Базовые значения
        int a = 10, b = 5;
        double x = 15.5, y = 4.5;
        boolean p = true, q = false;
        String s1 = "Hello", s2 = "World";

        // Арифметика
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

        // Присваивания
        int c = a;
        c += b;  // c = c + b
        c -= b;  // c = c - b
        c *= b;  // c = c * b
        c /= b;  // c = c / b
        c %= b;  // c = c % b
        System.out.println("После серии присваиваний c = " + c);

        // Сравнение
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a >  b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));

        // Логические операторы
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // Побитовые операторы для целых
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("a & b: " + (a & b));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));
        System.out.println("a >>> 2: " + (a >>> 2));
        System.out.println("~a: " + (~a)); // побитовое НЕ

        // Префиксная и постфиксная формы
        int t = 5;
        System.out.println("t++ (постфикс) возвращает старое значение: " + (t++)); // 5, потом t=6
        System.out.println("После t++ t = " + t);                                   // 6
        System.out.println("++t (префикс) сперва увеличивает: " + (++t));           // 7

        // Тернарный оператор
        int max = (a > b) ? a : b;
        System.out.println("max(a,b) через ?: " + max);

        // Операции со String
        System.out.println("Конкатенация через +: " + (s1 + " " + s2));
        String s = "count=";
        s += a; // оператор += конкатенирует, когда левый операнд — String
        System.out.println("Конкатенация через +=: " + s);

        // Индексация массива и приоритет
        int[] arr = {1, 2, 3};
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("Приоритет: 10 + 2 * 5 = " + (10 + 2 * 5)); // сначала * затем +
        System.out.println("Скобки меняют порядок: (10 + 2) * 5 = " + ((10 + 2) * 5));
    }
}
