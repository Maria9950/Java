package lab24;

/*Динамический полиморфизм не применяется к статическим методам, потому что они принадлежат классу, а не объекту.
Поэтому компилятор выбирает их во время компиляции, а не при выполнении программы.*/

//Пример ошибки
class A {
    public static void method() {
        System.out.println("A");
    }
}

class B extends A {
    @Override        //Ошибка: нельзя переопределять static
    public static void method() {
        System.out.println("B");
    }
}