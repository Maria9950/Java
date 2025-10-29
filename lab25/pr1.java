package lab25;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        //Проверка: сравнение с самим собой
        if (this == obj) return true;

        //Проверка: null и совпадение классов
        if (obj == null || getClass() != obj.getClass()) return false;

        //Приведение типа
        Point p = (Point) obj;

        //Сравнение по полям
        return this.x == p.x && this.y == p.y;
    }
}

public class pr1 {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2, 3);
        Point p4 = new Point(5, 1);

        //Проверка рефлексивности
        System.out.println("Рефлексивность: " + p1.equals(p1)); //true

        //Проверка сравнения с null
        System.out.println("Сравнение с null: " + p1.equals(null)); //false

        //Проверка симметричности
        System.out.println("Симметричность p1<=>p2: " + (p1.equals(p2) && p2.equals(p1))); //true

        //Проверка транзитивности
        System.out.println("Транзитивность p1>p2>p3: " +
                (p1.equals(p2) && p2.equals(p3) && p1.equals(p3))); //true

        //Проверка на разные объекты
        System.out.println("Разные объекты: " + p1.equals(p4)); //false
    }
}
