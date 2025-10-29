package lab23;

class Animal {
    //метод суперкласса
    public String sound() {
        return "Животное издаёт звук";
    }
}

class Dog extends Animal {
    //переопределяем метод суперкласса
    @Override
    public String sound() {
        return "Собака лает";
    }
}

public class pr2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println(a.sound()); //метод Animal
        System.out.println(d.sound()); //метод Dog (переопределённый)
    }
}
