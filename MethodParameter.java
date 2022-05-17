// Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

public class MethodParameter {
    static void myMethod(String fname) {
        System.out.println(fname + "Aja");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}