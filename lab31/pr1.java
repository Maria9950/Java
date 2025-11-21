package lab31;

public class pr1 {
    public static void main(String[] args) {

        String text = "  Hello, Java!  ";
        String other = "hello, java!";

        // 1) length() — возвращает длину строки (количество символов)
        System.out.println("1) length: " + text.length());

        // 2) charAt(int index) — возвращает символ по индексу (нумерация с 0)
        char ch = text.charAt(2);
        System.out.println("2) charAt(2): " + ch);

        // 3) substring(int begin, int end) — возвращает подстроку [begin, end)
        String sub = text.substring(2, 7);
        System.out.println("3) substring(2,7): " + sub);

        // 4) indexOf(String s) — ищет подстроку и возвращает её первый индекс, либо -1
        int idx = text.indexOf("Java");
        System.out.println("4) indexOf(\"Java\"): " + idx);

        // 5) toUpperCase() — возвращает новую строку, где все буквы в верхнем регистре
        String upper = text.toUpperCase();
        System.out.println("5) toUpperCase: " + upper);

        // 6) toLowerCase() — возвращает новую строку, где все буквы в нижнем регистре
        String lower = text.toLowerCase();
        System.out.println("6) toLowerCase: " + lower);

        // 7) trim() — убирает пробелы в начале и в конце строки
        String trimmed = text.trim();
        System.out.println("7) trim: \"" + trimmed + "\"");

        // 8) equals(String s) — сравнение строк с учётом регистра
        boolean eq = trimmed.equals(other);
        System.out.println("8) equals: " + eq);

        // 9) equalsIgnoreCase(String s) — сравнение строк без учёта регистра
        boolean eqIgnore = trimmed.equalsIgnoreCase(other);
        System.out.println("9) equalsIgnoreCase: " + eqIgnore);

        // 10) replace(char old, char new) — возвращает новую строку
        //      с заменой всех вхождений одного символа на другой
        String replaced = trimmed.replace('a', 'A');
        System.out.println("10) replace('a','A'): " + replaced);
    }
}
