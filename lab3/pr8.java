package lab3;
public class pr8 {
    public static void main(String[] args) {

        interface Animal {
            void makeSound(); // метод без реализации
        }

        // Класс Dog реализует интерфейс Animal
        class Dog implements Animal {
            public void makeSound() {
                System.out.println("Гав!");
            }
        }

        // Класс Cat реализует интерфейс Animal
        class Cat implements Animal {
            public void makeSound() {
                System.out.println("Мяу!");
            }
        }

        var dog = new Dog();
        var cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
