package array.test;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int N = sc.nextInt();

        System.out.println(N + "개의 정수를 입력하세요:");
        int[] nums = new int[N];

        for (int i = 0 ; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < N; i++) {

            if (max < nums[i]) {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
