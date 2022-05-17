// The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

public class JavaContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}