package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; 컴파일 오류 발생
        intValue = (int) doubleValue; // 명시적 형변환 (큰 범위의 값을 작은 범위에 대입할 때)
        System.out.println(intValue);

        //


    }
}
