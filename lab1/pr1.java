package lab1;
class Bird {
    public void eat() {
        System.out.println("Птица ест");
    }
}

class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Птица летает");
    }
}

class Sparrow extends FlyingBird {
    @Override
    public void fly() {
        System.out.println("Воробей летает");
    }
}

class Penguin extends Bird {
    public void swim() {
        System.out.println("Пингвин плавает");
    }
}

public class pr1 {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.eat();
        penguin.eat();

        ((FlyingBird) sparrow).fly();
        ((Penguin) penguin).swim();
    }
}
