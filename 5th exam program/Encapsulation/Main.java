package Encapsulation;

// Class with encapsulated fields
class Student {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student = new Student("John", 20);

        // Accessing and modifying encapsulated fields using getter and setter methods
        System.out.println("Original Name: " + student.getName());
        System.out.println("Original Age: " + student.getAge());

        student.setName("Alice");
        student.setAge(25);

        System.out.println("Modified Name: " + student.getName());
        System.out.println("Modified Age: " + student.getAge());

        // Trying to set an invalid age
        student.setAge(150);
    }
}
