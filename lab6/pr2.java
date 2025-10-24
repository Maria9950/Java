public class pr2 {
    public static void main(String[] args) {

        Boolean bool1 = Boolean.valueOf(true);
        System.out.println("valueOf(true): " + bool1);

        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.valueOf("False");
        System.out.println("valueOf(\"true\"): " + bool2);
        System.out.println("valueOf(\"False\"): " + bool3);

        boolean primitiveBool = Boolean.parseBoolean("true");
        System.out.println("parseBoolean(\"true\"): " + primitiveBool);

        Boolean bool4 = true;
        System.out.println("Автоупаковка: " + bool4);

        boolean primitive = bool4;
        System.out.println("Распаковка: " + primitive);
    }
}
