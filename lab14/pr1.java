package lab14;

public class pr1 {
    public static void main(String[] args) {
        //1.Через конструктор
        A obj1 = new A(10);
        obj1.show();

        //2.Через инициализацию при объявлении
        B obj2 = new B();
        obj2.show();

        //3.Через статическое поле (общая константа)
        System.out.println("C.CONST = " + C.CONST);
    }
}

//1.Инициализация через конструктор
class A {
    public final int a;

    public A(int value) {
        this.a = value;  //инициализация при создании объекта
    }

    void show() {
        System.out.println("a = " + a);
    }
}

//2.Инициализация при объявлении
class B {
    public final int a = 5; //сразу задано значение

    void show() {
        System.out.println("a = " + a);
    }
}

//3.Статическая константа класса
class C {
    public static final int CONST = 100; //значение задаётся при объявлении
}
