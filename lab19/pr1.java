package lab19;

enum Season {
    //каждый элемент перечисления создаётся как объект с параметрами
    WINTER("Холодно", -10),
    SPRING("Тает снег", 10),
    SUMMER("Жарко", 25),
    AUTUMN("Листопад", 8);

    //поля для каждого элемента
    private final String description;
    private final int averageTemp;

    //конструктор перечисления
    Season(String description, int averageTemp) {
        this.description = description;
        this.averageTemp = averageTemp;
    }

    //метод для вывода информации
    public void showInfo() {
        System.out.println(name() + ": " + description + ", t≈" + averageTemp + "°C");
    }
}

public class pr1 {
    public static void main(String[] args) {
        //пример использования и инициализации элементов
        for (Season s : Season.values()) {
            s.showInfo();
        }
    }
}
