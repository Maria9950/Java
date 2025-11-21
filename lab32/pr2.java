package lab32;

public class pr2 {
    public static void main(String[] args) {

        // String -> StringBuffer / StringBuilder
        String s = "Hello";

        // Конструктор StringBuffer(String)
        StringBuffer sbufFromStr = new StringBuffer(s);

        // Конструктор StringBuilder(String)
        StringBuilder sbldFromStr = new StringBuilder(s);


        // StringBuffer -> String / StringBuilder
        StringBuffer sbuf = new StringBuffer("Java");

        // toString() — получаем String
        String strFromSbuf = sbuf.toString();

        // Конструктор StringBuilder(CharSequence)
        // StringBuffer реализует CharSequence, поэтому так можно
        StringBuilder sbldFromSbuf = new StringBuilder(sbuf);


        // StringBuilder -> String / StringBuffer
        StringBuilder sbld = new StringBuilder("World");

        // toString() — получаем String
        String strFromSbld = sbld.toString();

        // Конструктор StringBuffer(CharSequence)
        // StringBuilder тоже CharSequence
        StringBuffer sbufFromSbld = new StringBuffer(sbld);

        System.out.println("sbufFromStr:   " + sbufFromStr);
        System.out.println("sbldFromStr:   " + sbldFromStr);
        System.out.println("strFromSbuf:   " + strFromSbuf);
        System.out.println("sbldFromSbuf:  " + sbldFromSbuf);
        System.out.println("strFromSbld:   " + strFromSbld);
        System.out.println("sbufFromSbld:  " + sbufFromSbld);
    }
}
