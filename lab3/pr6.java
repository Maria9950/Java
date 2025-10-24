package lab3;
public class pr6 {
    public static void main(String[] args) {
        int i = 130;
        // Явное сужающее преобразование int > byte
        // Диапазон byte: -128..127, поэтому произойдет переполнение
        // 130 - 256 = -126
        byte b = (byte) i;

        double d = 9.78;
        // Явное сужающее преобразование double > int
        // Дробная часть отбрасывается > результат 9
        int n = (int) d;

        long l = 100000L;
        // Явное сужающее преобразование long > short
        // Диапазон short: -32768..32767, произойдет переполнение > 34464
        short s = (short) l;

        float f = 123.45f;
        // Явное сужающее преобразование float > byte
        // Дробная часть отбрасывается, затем значение приводится к диапазону byte > 123
        byte small = (byte) f;

        System.out.println("int > byte: " + b);
        System.out.println("double > int: " + n);
        System.out.println("long > short: " + s);
        System.out.println("float > byte: " + small);
    }
}
