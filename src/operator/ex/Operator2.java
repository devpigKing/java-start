package operator.ex;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열과 문자열 더하기 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2
        String s1 = "dev";
        String s2 = "pigKing";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1
        // 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다. 쉽게 이야기해서 문자열에
        // 더하는 것은 다 문자열이 된다
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        int num = 77;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
