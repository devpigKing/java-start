package scope;

public class Scope1 {
    public static void main(String[] args) {
        int n = 10; // n 생존 시작

        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if n = " + n);
            System.out.println("if x = " + x);
        } // x 사망
        System.out.println("if n = " + n);
        // System.out.println("if x = " + x);


    } // n 사망
}
