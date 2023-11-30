package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 수는 : " + num1);
        } else if (num1 < num2) {
            System.out.println("더 큰 수는 : " + num2);
        } else {
            System.out.println("같아용");
        }
    }
}
