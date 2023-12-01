package scanner.test;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int intValue = sc.nextInt();

        if (intValue%2 == 0) {
            System.out.println("입력한 숫자 " + intValue + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + intValue + "는 홀수입니다.");

        }
    }
}
