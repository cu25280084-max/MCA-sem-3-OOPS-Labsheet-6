class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Q1_AnimalCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
