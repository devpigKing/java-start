package array.test;

import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N개의 정수를 입력하세요");
        int[] nums = new int[N];

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
