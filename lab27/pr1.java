package lab27;

interface Message {
    // Вложенный класс внутри интерфейса
    class Printer {
        public void printHello() {
            System.out.println("Привет из вложенного класса интерфейса Message!");
        }
    }
}

public class pr1 {
    public static void main(String[] args) {
        // Создаём объект вложенного класса
        Message.Printer p = new Message.Printer();

        // Вызываем метод вложенного класса
        p.printHello();
    }
}
