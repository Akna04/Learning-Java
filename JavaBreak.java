// You have already seen the break statement used in an earlier chapter of this tutorial. It was used to "jump out" of a switch statement.
// The break statement can also be used to jump out of a loop.

public class JavaBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==4) {
                break;
            }
            System.out.println(i);
        }
    }
}