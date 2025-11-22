package lab36;

class Ex1 extends Exception {
    public Ex1(String msg) { super(msg); }
}

class Ex2 extends Ex1 {
    public Ex2(String msg) { super(msg); }
}

class Ex3 extends Ex2 {
    public Ex3(String msg) { super(msg); }
}

public class pr1 {

    public static void main(String[] args) {

        // 1) Несколько исключений обрабатываются абсолютно одинаково
        try {
            if (args.length == 0) {
                int a = 10 / 0;          // ArithmeticException
            } else {
                String s = null;
                s.length();             // NullPointerException
            }
        } catch (ArithmeticException | NullPointerException e) {
            // одна и та же обработка для двух разных типов
            System.out.println("Ошибка вычислений или обращение к null: " + e);
        }

        // 2) Обработка исключений, образующих иерархию Ex1 <- Ex2 <- Ex3
        try {
            throw new Ex3("Произошла ошибка Ex3");
        } catch (Ex3 e) {              // сначала самый специфичный тип
            System.out.println("Обработка Ex3: " + e.getMessage());
        } catch (Ex2 e) {              // затем его родитель
            System.out.println("Обработка Ex2: " + e.getMessage());
        } catch (Ex1 e) {              // и в конце базовый класс
            System.out.println("Обработка Ex1: " + e.getMessage());
        }
    }
}
