package Inheritance;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of child classes
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling methods of child classes
        dog.sound();
        cat.sound();
    }
}
