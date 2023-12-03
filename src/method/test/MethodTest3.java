package method.test;

public class MethodTest3 {
    static int balance = 10000;
    public static void main(String[] args) {

        // 입금 1000
        int depositAmount = 1000;
        deposit(depositAmount);

        // 출금 2000
        int withdrawAmount = 2000;
        withdraw(withdrawAmount);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static void deposit (int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
    }

    public static void withdraw (int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " +
                    balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니 다.");
        }

    }
}
