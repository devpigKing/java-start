package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int n = 10;
        int temp = 0;
        if( n > 0 ) {
            temp = n * 2;
            System.out.println("temp = " + temp);
        }

        System.out.println("n = " + n);
    }
}
