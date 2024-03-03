package Abstraction;

// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();
}

// Concrete class implementing Shape
class Circle extends Shape {
    // Implementation of draw method
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete class implementing Shape
class Rectangle extends Shape {
    // Implementation of draw method
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Calling draw method of concrete classes
        circle.draw();
        rectangle.draw();
    }
}
