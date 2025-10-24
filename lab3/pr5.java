package lab3;
public class pr5 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        long l = 30L;
        float f = 1.5f;
        double d = 2.5;

        int result1 = b + i;
        long result2 = i + l;
        float result3 = l + f;
        double result4 = f + d;

        System.out.println("byte + int = " + result1);
        System.out.println("int + long = " + result2);
        System.out.println("long + float = " + result3);
        System.out.println("float + double = " + result4);
    }
}

//Java при вычислениях с разными типами данные автоматически расширяются к типу большего диапазона (byte > short > int > long > float > double)