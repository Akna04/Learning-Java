// A method is a block of code which only runs when it is called.
// You can pass data, known as parameters, into a method.
// Methods are used to perform certain actions, and they are also known as functions.
// Why use methods? To reuse code: define the code once, and use it many times.

// myMethod() = is the name of the method
// static = means that the method belongs to the Main class and not an object of the Main class.
// void = means that this method does not have a return value. 

public class Method {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}