package cond.test;

public class condTest2 {
    public static void main(String[] args) {
        int distance = 5999;

        String solution;

        if (distance <= 1) {
            solution = "도보";
        } else if (distance <= 10) {
            solution = "자전거";
        } else if (distance <= 100) {
            solution = "자동차";
        } else {
            solution = "비행기";
        }

        System.out.println("출력 : " + solution + "를 이용하세요.");
    }
}
