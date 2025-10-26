package lab17;

class Box<T> {
    private T value;
    public Box(T value) { this.value = value; }
    public T get() { return value; }
    public void set(T value) { this.value = value; }
}

public class pr2 {
    //<? extends Number> — можно читать как Number, но нельзя записывать
    static void show(Box<? extends Number> box) {
        Number n = box.get(); //чтение допустимо
        System.out.println("Значение: " + n);
        // box.set(10); //ошибка: тип может быть Double, Integer и т.д.
    }

    //<? super Integer> — можно безопасно записывать Integer
    static void fill(Box<? super Integer> box) {
        box.set(100); //запись допустима
        System.out.println("Integer записан в Box");
        //Integer x = box.get(); //ошибка: вернётся Object
    }

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(5);
        Box<Double>  b2 = new Box<>(3.14);
        Box<Number>  b3 = new Box<>(0);
        Box<Object>  b4 = new Box<>((Object)0);

        show(b1); //Integer подходит под <? extends Number>
        show(b2); //Double тоже Number
        show(b3); //Number подходит сам себе

        fill(b1); //Box<Integer> можно
        fill(b3); //Box<Number> можно
        fill(b4); //Box<Object> можно
    }

    //extends используется, когда контейнер производит данные (чтение)
    //super используется, когда контейнер принимает данные (запись)
}

