package lab32;

public class pr1 {

    public static void main(String[] args) {

        // STRINGBUILDER

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        // append() — добавляет строку в конец

        sb.insert(5, ",");
        // insert() — вставляет строку в нужную позицию

        sb.replace(0, 1, "J");
        // replace() — заменяет часть строки

        sb.deleteCharAt(5);
        // deleteCharAt() — удаляет символ по индексу

        sb.reverse();
        // reverse() — переворачивает строку наоборот

        int capacity = sb.capacity();
        // capacity() — возвращает текущую вместимость буфера


        // STRINGBUFFER

        StringBuffer sbf = new StringBuffer("Java");

        sbf.ensureCapacity(50);
        // ensureCapacity() — увеличивает вместимость буфера до нужного значения

        sbf.trimToSize();
        // trimToSize() — обрезает вместимость до текущей длины строки

        sbf.appendCodePoint(33);
        // appendCodePoint() — добавляет символ по его Unicode-коду

        sbf.setLength(2);
        // setLength() — изменяет длину строки (обрезает или дополняет \u0000)

        System.out.println("StringBuilder result: " + sb);
        System.out.println("Capacity: " + capacity);
        System.out.println("StringBuffer result: " + sbf);
    }
}
