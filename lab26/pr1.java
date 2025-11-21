package lab26;

// Внешний класс
public class Outer {

    // Публичный внутренний класс — доступен из любого места
    public class PublicInner {
        public void show() {
            System.out.println("Публичный внутренний класс");
        }
    }

    // Защищённый внутренний класс — доступен только в пакете и подклассах
    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected внутренний класс");
        }
    }

    // Класс без модификатора — доступен только внутри пакета
    class DefaultInner {
        public void show() {
            System.out.println("Класс с доступом по умолчанию (package-private)");
        }
    }

    // Приватный внутренний класс — доступен только внутри Outer
    private class PrivateInner {
        public void show() {
            System.out.println("Приватный внутренний класс");
        }
    }

    // Метод внутри Outer, который может использовать приватный внутренний класс
    public void createPrivateInner() {
        PrivateInner in = new PrivateInner();
        in.show();
    }
}

public class pr1 {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Доступ к public-внутреннему классу
        Outer.PublicInner pub = outer.new PublicInner();
        pub.show();

        // Доступ к protected и default-внутренним классам — только из того же пакета
        Outer.ProtectedInner prot = outer.new ProtectedInner();
        prot.show();

        Outer.DefaultInner def = outer.new DefaultInner();
        def.show();

        // К приватному классу доступ только через метод самого Outer
        outer.createPrivateInner();
    }
}
