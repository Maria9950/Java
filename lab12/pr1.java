package lab12;

class Base {
    void show() {
        System.out.println("Base: метод show()");
    }

    // Перегрузка
    void show(int a) {
        System.out.println("Base: show(int a) = " + a);
    }
}

class Sub extends Base {
    // Переопределение
    @Override
    void show() {
        System.out.println("Sub: переопределённый метод show()");
    }
}

public class pr1 {
    public static void main(String[] args) {
        Base b = new Base();
        Sub s = new Sub();

        System.out.println("Перегрузка");
        b.show();
        b.show(10);

        System.out.println("\nПереопределение");
        s.show(); //вызывает переопределённую версию
    }
}
