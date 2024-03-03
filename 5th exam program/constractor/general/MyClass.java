package constractor.general;

public class MyClass {
    private int myNumber;
    private String myString;

    // Constructor
    public MyClass(int number, String text) {
        this.myNumber = number;
        this.myString = text;
    }

    // Getter methods
    public int getMyNumber() {
        return myNumber;
    }

    public String getMyString() {
        return myString;
    }

    public static void main(String[] args) {
        // Creating an object of MyClass using the constructor
        MyClass myObject = new MyClass(10, "Hello");

        // Accessing the values using getter methods
        System.out.println("Number: " + myObject.getMyNumber());
        System.out.println("String: " + myObject.getMyString());
    }
}
