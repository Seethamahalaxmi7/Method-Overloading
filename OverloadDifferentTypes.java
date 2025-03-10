class Test {
    // Method with an integer parameter
    void show(int a) {
        System.out.println("Integer method: " + a);
    }

    // Overloaded Method with a String parameter
    void show(String b) {
        System.out.println("String method: " + b);
    }
}

public class OverloadDifferentTypes {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show(10);        // Calls method with int parameter
        obj.show("Hello");   // Calls method with String parameter
    }
}
