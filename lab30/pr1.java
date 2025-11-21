package lab30;

interface MyInterface {

    // Неабстрактный метод с реализацией по умолчанию
    default void show() {
        System.out.println("MyInterface: реализация по умолчанию show()");
    }

    // Статический метод интерфейса
    static void info() {
        System.out.println("MyInterface: статический метод info()");
    }
}

// Класс реализует интерфейс
class MyClass implements MyInterface {

    // Переопределяем default-метод
    @Override
    public void show() {
        System.out.println("MyClass: своя версия show()");
        // при желании можем вызвать реализацию интерфейса
        MyInterface.super.show();
    }

    // Пример вызова static-метода интерфейса из класса-реализации
    public void callStaticFromClass() {
        MyInterface.info();
    }
}

public class pr1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        System.out.println("1) Вызов default-метода через объект класса:");
        obj.show();                       // вызывается переопределённый метод MyClass.show()

        System.out.println("\n2) Вызов default-метода через ссылку типа интерфейса:");
        MyInterface ref = obj;
        ref.show();                       // тоже MyClass.show()

        System.out.println("\n3) Вызов статического метода интерфейса по имени интерфейса:");
        MyInterface.info();               // MyInterface: статический метод

        System.out.println("\n4) Вызов статического метода интерфейса из метода класса-реализации:");
        obj.callStaticFromClass();        // внутри метода используется MyInterface.info()
    }
}
