package method.test;

public class MethodTest2 {
    public static void main(String[] args) {
        loop("Hello, World!", 3);
        loop("Hello, World!", 5);
        loop("Hello, World!", 7);
    }

    public static void loop (String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
