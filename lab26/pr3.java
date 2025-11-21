package lab26;

/*Внешний класс имеет полный доступ ко всем полям и методам внутреннего класса,
в том числе private, потому что внутренний класс рассматривается как часть внешнего.
Для других классов возможность доступа к внутреннему классу и его членам определяется
обычными модификаторами доступа 
(public-видно отовсюду, protected-только в пакете и наследниках, default-только в пакете, private-только внутри того же внешнего класса)
у самого внутреннего класса и его методов. */

// Внешний класс
public class Outer {

    // Внутренний класс
    class Inner {
        private int a = 1;
        int b = 2;              // доступ по умолчанию (package-private)
        protected int c = 3;
        public int d = 4;

        private void secret() {
            System.out.println("secret()");
        }

        void def() {
            System.out.println("def()");
        }

        protected void prot() {
            System.out.println("prot()");
        }

        public void pub() {
            System.out.println("pub()");
        }
    }

    // Метод внешнего класса: доступ ко всем полям и методам Inner
    public void testInnerAccess() {
        Inner in = new Inner();

        // поля
        System.out.println(in.a); // private — доступ есть
        System.out.println(in.b); // default — доступ есть
        System.out.println(in.c); // protected — доступ есть
        System.out.println(in.d); // public — доступ есть

        // методы
        in.secret(); // private
        in.def();    // default
        in.prot();   // protected
        in.pub();    // public
    }
}

// Другой класс в том же пакете
class TestAccess {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();

        // Здесь действуют обычные правила модификаторов членов Inner:
        // System.out.println(in.a); // private — нельзя
        System.out.println(in.b);    // default — можно (тот же пакет)
        System.out.println(in.c);    // protected — можно (тот же пакет)
        System.out.println(in.d);    // public — можно

        // in.secret();              // private — нельзя
        in.def();                    // default — можно
        in.prot();                   // protected — можно
        in.pub();                    // public — можно
    }
}