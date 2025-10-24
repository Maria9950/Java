package lab8;
public class pr1 {
    public static void main(String[] args) {

        //int
        int num = 2;
        switch (num) {
            case 1 -> System.out.println("int: один");
            case 2 -> System.out.println("int: два");
            default -> System.out.println("int: другое");
        }

        //char
        char ch = 'B';
        switch (ch) {
            case 'A' -> System.out.println("char: A");
            case 'B' -> System.out.println("char: B");
            default -> System.out.println("char: другое");
        }

        //String
        String word = "hi";
        switch (word) {
            case "hi" -> System.out.println("String: привет");
            case "bye" -> System.out.println("String: пока");
            default -> System.out.println("String: что-то ещё");
        }

        //enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY -> System.out.println("enum: понедельник");
            case FRIDAY -> System.out.println("enum: пятница");
            default -> System.out.println("enum: другой день");
        }

        //классы-оболочки
        Integer i = 3;
        switch (i) {
            case 1 -> System.out.println("Integer: один");
            case 3 -> System.out.println("Integer: три");
            default -> System.out.println("Integer: другое");
        }
    }

    // перечисление (enum)
    enum Day { MONDAY, FRIDAY, SUNDAY }
}
