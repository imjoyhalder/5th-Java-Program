// Base class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Polymorphism: a Dog object can be referenced by an Animal reference
        Animal myAnimal = new Dog();
        myAnimal.sound(); // This will call Dog's sound method

        // Polymorphism: a Cat object can be referenced by an Animal reference
        myAnimal = new Cat();
        myAnimal.sound(); // This will call Cat's sound method
    }
}
