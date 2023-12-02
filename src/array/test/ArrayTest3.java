package array.test;

import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("N개의 정수를 입력하세요:");
        int[] nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = (nums.length-1); i >= 0; i--) {
            System.out.print(nums[i]);
            if (i >= 1) {
                System.out.print(", ");
            }
        }
    }
}
