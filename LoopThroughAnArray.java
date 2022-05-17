// You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

public class LoopThroughAnArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}