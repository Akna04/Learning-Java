// A multidimensional array is an array of arrays.
// To create a two-dimensional array, add each array within its own set of curly braces

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = { {1,2,3,4}, {5,6,7} };
        int x = myNumbers[0][2];
        System.out.println(x);
    }
}