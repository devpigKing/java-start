package loop.test;

public class LoopTest1 {
    public static void main(String[] args) {
        int count = 1;

        while (true) {
            System.out.println(count);
            if (count == 10) {
                break;
            }
            count++;

        }
    }
}
