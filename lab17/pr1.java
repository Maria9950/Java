package lab17;

class Wrapper<T> {
    private T item;
    public Wrapper(T item) { this.item = item; }
    public T getItem() { return item; }
}

public class pr1 {
    public static void main(String[] args) {
        Wrapper<Integer> w1 = new Wrapper<>(10);
        Wrapper<String>  w2 = new Wrapper<>("hi");

        //Проверяем тип объекта без уточнения параметра
        if (w1 instanceof Wrapper) {
            System.out.println("w1 — объект класса Wrapper");
        }

        if (w2 instanceof Wrapper) {
            System.out.println("w2 — тоже Wrapper");
        }

        //нельзя
        //if (w1 instanceof Wrapper<Integer>) //ошибка компиляции
    }
}
