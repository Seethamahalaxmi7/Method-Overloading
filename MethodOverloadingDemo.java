class Calculator {
    // Method with one parameter
    void add(int a) {
        System.out.println("Addition with one parameter: " + (a + 10));
    }

    // Overloaded Method with two parameters (same name, different parameters)
    void add(int a, int b) {
        System.out.println("Addition with two parameters: " + (a + b));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        // Creating an object
        Calculator obj = new Calculator();

        // Calling overloaded methods
        obj.add(5);       // Calls the method with one parameter
        obj.add(5, 15);   // Calls the method with two parameters
    }
}
