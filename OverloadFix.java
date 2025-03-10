class Test {
    void show(int a) {
        System.out.println("Method 1: Integer " + a);
    }

    // ✅ Slight change: Different parameter name (allowed)
    void show(int b, int c) {
        System.out.println("Method 2: Two Integers " + b + " & " + c);
    }
}

public class OverloadFix {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show(10);       // Calls method with one parameter
        obj.show(5, 15);    // Calls method with two parameters
    }
}
