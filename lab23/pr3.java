package lab23;

class Animal {
    public void sound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    //Ошибка: опечатка в названии метода (soud вместо sound)
    @Override
    public void soud() { 
        System.out.println("Собака лает");
    }
}

public class pr3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); //выполнится метод из Animal, а не из Dog
    }
}
