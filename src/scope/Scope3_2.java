package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int n = 10;

        if( n > 0 ) {
            int temp = n * 2;
            System.out.println("temp = " + temp);
        } // temp 사망

        System.out.println("n = " + n);
    }
}
