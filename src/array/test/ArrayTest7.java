package array.test;

import java.util.Scanner;

public class ArrayTest7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = { "국어", "영어", "수학" };

        for(int i=0; i<4; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for(int j=0; j<3; j++){
                System.out.print(subjects[j] + " 점수:");
                students[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j <3; j++) {
                total += students[i][j];
            }
            double avg = (double) total/3;
            System.out.println((i+1) + "번 학생의 총점: " + total + "평균: " + avg);
        }
    }
}
