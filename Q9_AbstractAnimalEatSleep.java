abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in its den");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger rests in a sheltered place");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass and leaves");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleeps in a safe, sheltered area");
    }
}

public class Q9_AbstractAnimalEatSleep {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Tiger(), new Deer()};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
