//Create a Main class
public class AccessMethodWithObject {
    
    //Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    //Create a speed() method and add a parameter
    public void speed(int maxSpeeed) {
        System.out.println("Max speed is: " + maxSpeeed);
    }

    //Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        AccessMethodWithObject myCar = new AccessMethodWithObject(); //Create a myCar object
        myCar.fullThrottle(); //Call the fullThrottle() method
        myCar.speed(200); //Call the speed() method
    }
}

//Remember that..

//The dot (.) is used to access the object's attributes and methods.
//To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
//A class must have a matching filename (Main and Main.java).