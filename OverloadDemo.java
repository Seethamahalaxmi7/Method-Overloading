class Test {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(double b) {
        System.out.println("Double: " + b);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.show(10);      // Calls method with int
        obj.show(5.5);     // Calls method with double
    }
}
