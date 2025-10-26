package lab18;

class Printer {
    //Метод 1 принимает одно число
    public void print(int num) {
        System.out.println("Одно число: " + num);
    }

    //Метод 2 принимает переменное количество чисел (varargs)
    public void print(int... nums) {
        System.out.print("Несколько чисел: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    //Метод 3 принимает переменное количество строк
    public void print(String... texts) {
        System.out.print("Строки: ");
        for (String s : texts) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

public class pr1 {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print(5);              //вызов метода с одним числом
        p.print(1, 2, 3, 4, 5);  //вызов метода с varargs int
        p.print("Java", "rocks"); //вызов метода с varargs String
    }
}