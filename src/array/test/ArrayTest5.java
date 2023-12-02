package array.test;

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int N = sc.nextInt();
        int[] nums = new int[N];

        System.out.println(N + "개의 정수를 입력하세요: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int total = 0;
        double avg;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        avg = (double) total/nums.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);

    }
}
