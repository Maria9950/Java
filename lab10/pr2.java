import java.util.Arrays;

public class pr2 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        // sort(...) — сортировка массива
        Arrays.sort(numbers);

        // toString(...) — преобразование массива в строку
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        // binarySearch(...) — поиск элемента
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Индекс элемента 7: " + index);

        // equals(...) — сравнение двух массивов
        int[] copy = {1, 2, 5, 7, 9};
        System.out.println("Массивы равны: " + Arrays.equals(numbers, copy));
    }
}
