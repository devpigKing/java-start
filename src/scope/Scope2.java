package scope;

public class Scope2 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부, for문 내 i 생존
            System.out.println("for n = " + n); // 블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 사망

        // System.out.println("for i = " + i);
        System.out.println("for n = " + n);

    } // n 사망
}
