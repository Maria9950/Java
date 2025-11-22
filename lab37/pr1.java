package lab37;

// Собственный класс исключения
class MyFirstException extends Exception {

    // Конструктор без параметров
    public MyFirstException() {
        super("Произошло моё первое исключение!");
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class pr1 {
    public static void main(String[] args) {

        try {
            generateError();   // генерируем своё исключение
        } catch (MyFirstException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }

    // Метод, который генерирует наше исключение
    public static void generateError() throws MyFirstException {
        throw new MyFirstException("Ошибка из метода generateError()");
    }
}
