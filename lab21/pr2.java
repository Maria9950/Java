package lab21;

final class Parent {
    void show() {
        System.out.println("Это final-класс Parent");
    }
}

//Ошибка: невозможно наследоваться от final-класса
class Child extends Parent {
    void display() {
        System.out.println("Подкласс Child");
    }
}

public class pr2 {
        public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
    }
}

