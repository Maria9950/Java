package lab23;

class MathUtil {
    //Метод 1 — сумма двух целых чисел
    public int sum(int a, int b) {
        return a + b;
    }

    //Метод 2 — сумма трёх целых чисел (перегружен)
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Метод 3 — сумма двух чисел с плавающей точкой (тоже перегружен)
    public double sum(double a, double b) {
        return a + b;
    }
}

public class pr1 {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println(m.sum(2, 3));        //вызов 1-го метода
        System.out.println(m.sum(2, 3, 4));     //вызов 2-го метода
        System.out.println(m.sum(2.5, 3.5));    //вызов 3-го метода
    }
}
