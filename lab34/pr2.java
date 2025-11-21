package lab34;

public class pr2 {

    public static void main(String[] args) {
        arithmeticExample();
        arrayIndexExample();
        illegalArgumentExample();
        classCastExample();
        nullPointerExample();
    }

    // 1) ArithmeticException
    static void arithmeticExample() {
        try {
            int a = 10 / 0;     // деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException пойман: " + e.getMessage());
        }
    }

    // 2) ArrayIndexOutOfBoundsException
    static void arrayIndexExample() {
        try {
            int[] arr = new int[3];
            arr[5] = 10;        // обращение за предел массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException пойман: " + e.getMessage());
        }
    }

    // 3) IllegalArgumentException
    static void illegalArgumentExample() {
        try {
            setAge(-5);         // некорректный аргумент
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException пойман: " + e.getMessage());
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    // 4) ClassCastException
    static void classCastExample() {
        try {
            Object obj = "Hello";
            Integer n = (Integer) obj;   // неправильное приведение типа
        } catch (ClassCastException e) {
            System.out.println("ClassCastException пойман: " + e.getMessage());
        }
    }

    // 5) NullPointerException
    static void nullPointerExample() {
        try {
            String s = null;
            int len = s.length();        // обращение к методу у null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException пойман: " + e.getMessage());
        }
    }
}
