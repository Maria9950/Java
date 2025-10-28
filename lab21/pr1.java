package lab21;


class Parent {
    //метод final запрещено переопределять
    public final void show() {
        System.out.println("Метод суперкласса Parent");
    }
}

class Child extends Parent {
    //Ошибка: нельзя переопределять final-метод родителя
    @Override
    public void show() {
        System.out.println("Метод подкласса Child");
    }
}

public class pr1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}