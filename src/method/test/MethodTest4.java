package method.test;

import java.util.Scanner;

public class MethodTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                int deposit = sc.nextInt();
                price += deposit;
                System.out.println(deposit + "원을 입금하였습니다. 현재 잔액: " + price);
            } else if (option == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdraw = sc.nextInt();
                if (price < withdraw) {
                    System.out.println(withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
                } else {
                    price -= withdraw;
                    System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액: " + price);
                }

            } else if (option == 3) {
                System.out.println("현재 잔액: " + price);
            } else if (option == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 옵션을 입력하셨습니다.");
            }
        }
    }
}
