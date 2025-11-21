package lab31;

import java.util.StringJoiner;

public class pr2 {

    public static void main(String[] args) {

        // Пример 1: простой StringJoiner
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Cherry");

        System.out.println("Пример 1:");
        System.out.println(joiner1); // Apple, Banana, Cherry
        System.out.println();


        // Пример 2: StringJoiner с префиксом и суффиксом
        StringJoiner json = new StringJoiner(", ", "{", "}");
        json.add("\"name\":\"Maria\"");
        json.add("\"age\":20");
        json.add("\"city\":\"SPb\"");

        System.out.println("Пример 2:");
        System.out.println(json); 
        // {"name":"Maria", "age":20, "city":"SPb"}
        System.out.println();


        // Пример 3: объединение двух StringJoiner с помощью merge
        StringJoiner j1 = new StringJoiner(", ");
        j1.add("Math").add("Physics");

        StringJoiner j2 = new StringJoiner(", ");
        j2.add("Java").add("Discrete");

        j1.merge(j2); // объединяем два StringJoiner

        System.out.println("Пример 3:");
        System.out.println(j1); 
    }
}