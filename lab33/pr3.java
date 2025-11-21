package lab33;

import java.util.Formatter;
import java.util.Date;

public class pr3 {
    public static void main(String[] args) {
        Date now = new Date();
        Formatter fmt = new Formatter();

        fmt.format("Текущее время: %tH:%tM:%tS\n", now, now, now);
        fmt.format("Миллисекунды: %tL\n", now);
        fmt.format("Дата: %tA, %tB %tm, %tY\n", now, now, now, now);

        System.out.println(fmt);
        fmt.close();
    }
}
