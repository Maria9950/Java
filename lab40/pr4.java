package lab40;

/*Интерфейс AutoCloseable используется для того, чтобы объект можно было автоматически закрывать после использования,
даже если во время работы возникло исключение. */
class MyResource implements AutoCloseable {
    public void work() {
        System.out.println("Работаю...");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}

public class pr4 {
    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.work();
        }
    }
}
