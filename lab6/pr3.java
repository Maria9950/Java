public class pr3 {
    public static void main(String[] args) {

        Integer num = null; //объект Integer равен null
        System.out.println("Попытка выполнить автораспаковку...");

        //При попытке использовать null как примитив произойдёт ошибка
        try {
            int value = num; //здесь произойдёт NullPointerException
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: нельзя выполнить автораспаковку, так как объект равен null");
        }
    }
}
