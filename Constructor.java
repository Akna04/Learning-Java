// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
// It can be used to set initial values for object attributes

// Create a Main Class
public class Constructor {
    int x;

    // Creat a class constructor for the main class
    public Constructor() {
        x = 5;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor();
        System.out.println(myObj.x);
    }
}