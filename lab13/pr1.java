package lab13;

public class pr1 {
    public static void main(String[] args) {
        //1.Вызов статического метода по имени класса
        A.printVars();

        //2.Вызов через объект
        A obj = new A();
        obj.printVars();

        //3.Вызов из другого статического метода
        A.showVars();
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

        //Дополнительный статический метод, который вызывает первый
    public static void showVars() {
        System.out.println("Вызов из другого статического метода:");
        printVars();
    }
}
