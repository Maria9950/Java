package lab26;

/*Внутренний класс имеет полный доступ ко всем полям и методам внешнего класса, включая private.
Спецификаторы доступа public, protected, default и private ограничивают доступ извне,
но не ограничивают доступ между внешним и внутренним классом. */

public class Outer {

    private int a = 10;
    int b = 20;              // default
    protected int c = 30;
    public int d = 40;

    public class Inner {
        public void showValues() {
            System.out.println("a = " + a); // private — доступ есть
            System.out.println("b = " + b); // default — доступ есть
            System.out.println("c = " + c); // protected — доступ есть
            System.out.println("d = " + d); // public — доступ есть
        }
    }
}

public class pr2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showValues();
    }
}
