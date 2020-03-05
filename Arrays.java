
/*

Create an array of numbers.
Create a method that takes an array and prints each value in the array.
Create another method that takes an array of integers and returns a string
stating the lowest int and highest int.
Example input: {104, 32, 5, 88, 7}
Example output:
	Lowest number: 5
	Highest number: 104

BONUS:

Create a method that fills an array with 5 random integers and sorts the
array from least to greatest. Have the method return the sorted array.
Example input: {104, 32, 5, 88, 7}
Example output: {5, 7, 32, 88, 104}
Create a method that reads the array

 */

import java.util.Arrays;

public class Arrays {

    public static void arrayPrintEachValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void arrayPrint(int[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static String arrayReturnAString(int[] array) {
        int lowest = array[0];
        int highest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        String output = "Highest: " + highest + "\nLowest: " + lowest;
        return output;
    }



    /*
    
    BONUS:

    Create a method that fills an array with 5 random integers and sorts the
    array from least to greatest. Have the method return the sorted array.
    Example input: {104, 32, 5, 88, 7}
    Example output: {5, 7, 32, 88, 104}
    Create a method that reads the array

    */

    public static int[] sortArray() {
        int[] randArray = new int[5];
        // fill array with random numbers
        for (int i = 0; i < randArray.length; i++) {
            // use Math.random to get a random number for each index
            randArray[i] = (int) (Math.random() * 100);
        }
        // sort the array
        Arrays.sort(randArray);
        // return the array
        return randArray;
    }

    public static void main(String[] args) {
        int[] arrayNums = {104, 32, 5, 8, 7};

        arrayPrintEachValue(arrayNums);

        System.out.println();
        arrayPrint(arrayNums);

        System.out.println();
        System.out.println(arrayReturnAString(arrayNums));

        System.out.println();
        System.out.println(Arrays.toString(sortArray()));

    }
}
