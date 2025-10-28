package lab22;

class Parent {
    String name = "Родитель";

    Parent(String msg) { //конструктор суперкласса
        System.out.println("Конструктор суперкласса: " + msg);
    }

    void show() {
        System.out.println("Метод суперкласса show()");
    }
}

class Child extends Parent {
    String name = "Ребёнок";

    Child() {
        super("Вызван из подкласса"); //вызов конструктора суперкласса
    }

    void display() {
        System.out.println("Поле суперкласса name = " + super.name); //доступ к полю суперкласса
        super.show(); //вызов метода суперкласса
    }
}

public class pr1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
