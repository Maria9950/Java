package lab29;

public class pr1 {

    /*@Override - показывает, что метод должен переопределять метод из суперкласса или интерфейса.
      Если подпись не совпала (опечатка в имени, другой тип параметров) — компилятор даст ошибку. */

    // Пример @Override
    static class Parent {
        void print() {
            System.out.println("Parent");
        }
    }

    static class Child extends Parent {
        @Override
        void print() {                       // корректное переопределение
            System.out.println("Child");
        }
    }

    /* @Deprecated - помечает метод/класс как устаревший.
    Код ещё работает, но использовать этот элемент не рекомендуется — есть новый вариант. */

    // Пример @Deprecated
    static class Utils {
        @Deprecated
        static void oldMethod() {
            System.out.println("Старый способ (deprecated)");
        }

        static void newMethod() {
            System.out.println("Новый способ");
        }
    }

    /* @SuppressWarnings - говорит компилятору: “не показывай вот такое предупреждение”.
    Используется, когда ты осознанно пишешь код, который вызывает предупреждение, но это нормально. */

    // Пример @SuppressWarnings
    public static class Demo {

        @SuppressWarnings("deprecation")     // убираем предупреждение о oldMethod()
        void callDeprecated() {
            Utils.oldMethod();               // предупреждение подавлено
        }
    }


    public static void main(String[] args) {

        System.out.println("@Override");
        Parent p = new Parent();
        Child c = new Child();
        p.print();
        c.print();

        System.out.println("\n@Deprecated");
        Utils.newMethod();
        Utils.oldMethod();                   // обычный вызов: появится предупреждение

        System.out.println("\n@SuppressWarnings");
        Demo d = new Demo();
        d.callDeprecated();                  // предупреждение подавлено
    }
}
