package Overloading;

public class OverloadingExample {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        // Calling the method with two integers
        System.out.println("Sum of 5 and 10: " + obj.add(5, 10));

        // Calling the method with three integers
        System.out.println("Sum of 5, 10, and 15: " + obj.add(5, 10, 15));

        // Calling the method with two doubles
        System.out.println("Sum of 5.5 and 10.5: " + obj.add(5.5, 10.5));
    }
}
