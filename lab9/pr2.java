public class pr2 {
    public static void main(String[] args) {

        //Пример использования break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Цикл прерван на i = " + i);
                break; //выход из цикла, когда i == 5
            }
            System.out.println("i = " + i);
        }

        //Пример использования continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; //пропускаем все чётные числа
            }
            System.out.println("Нечётное число: " + i);
        }
    }
}
