public class pr2 {
    interface Shape { }
    static class Circle implements Shape { }
    static class Square implements Shape { }

    static class Animal { }
    static class Dog extends Animal { }
    static class Cat extends Animal { }

    public static void main(String[] args) {
        //Наследование классов
        Animal a1 = new Dog();
        System.out.println("a1 instanceof Animal: " + (a1 instanceof Animal)); // true
        System.out.println("a1 instanceof Dog: " + (a1 instanceof Dog));       // true
        System.out.println("a1 instanceof Cat: " + (a1 instanceof Cat));       // false

        //Реализация интерфейса
        Shape s1 = new Circle();
        System.out.println("s1 instanceof Shape: " + (s1 instanceof Shape));   // true
        System.out.println("s1 instanceof Circle: " + (s1 instanceof Circle)); // true
        System.out.println("s1 instanceof Square: " + (s1 instanceof Square)); // false

        //Строки как объекты
        Object o = "text";
        System.out.println("o instanceof String: " + (o instanceof String));   // true
        System.out.println("o instanceof Object: " + (o instanceof Object));   // true

        //Массивы
        int[] arr = {1, 2, 3};
        System.out.println("arr instanceof int[]: " + (arr instanceof int[]));     // true
        System.out.println("arr instanceof Object: " + (arr instanceof Object));   // true
        // Примечание: примитивные массивы не являются Object[]:
        System.out.println("arr instanceof Object[]: " + (arr instanceof Object[])); // false

        //null-объект
        String s = null;
        System.out.println("s instanceof String: " + (s instanceof String));   // false
        //Для null оператор instanceof всегда возвращает false
    }
}
