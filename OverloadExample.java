class Test {
    int calculate(int a) {  
        return a * 2;  // Returns integer
    }

    String calculate(int a, String text) {  
        return text + a;  // Returns String
    }
}

public class OverloadExample {
    public static void main(String[] args) {
        Test obj = new Test();

        int result1 = obj.calculate(10);             // Calls int method
        String result2 = obj.calculate(20, "Num: "); // Calls String method

        System.out.println(result1);
        System.out.println(result2);
    }
}
