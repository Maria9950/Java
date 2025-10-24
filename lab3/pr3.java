package lab3;
public class pr3 {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }

        // Ошибка: переменная b недоступна за пределами блока
        // int c = a + b;  //ошибка компиляции: cannot find symbol
    }
}
