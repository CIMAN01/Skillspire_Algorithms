/*

Create an array of numbers:

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

public class ArraysAlgorithm {

    public static void arrayPrintEachValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void arrayPrint(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // a method that returns the highest and lowest number in an array
    public static String arrayReturnHighLow(int[] array) {
        // create variables to store first indexes
        int lowest = array[0];
        int highest = array[0];
        // loop through the array to find highest and lowest numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i];
            }
            if (array[i] > highest) {
                highest = array[i];
            }
        }
        // create a string variable and store the highest and lowest number
        String output = "Highest: " + highest + "\nLowest: " + lowest;
        // return a string
        return output;
    }

    // a method the creates an array of size int with random values
    public static int[] createRandomArray(int size) {
        int[] randArray = new int[size];
        // fill array with random numbers
        for (int i = 0; i < randArray.length; i++) {
            // use Math.random to get a random number for each index
            randArray[i] = (int) (Math.random() * 100);
        }
        return randArray;
    }

    // a method that sorts the array from lowest to highest
    public static int[] sortArray(int[] array) {
        // outer loop
        for (int i = 0; i < array.length; i++){
            // inner loop
            for (int j = i + 1; j < array.length ; j++) {
                // if array[j] is less than array[i]
                if (array[i] > array[j]) {
                    // swap the indexes
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // return the sorted array
        return array;
    }

    // another way to sort an array by using built-in method
    public static int[] sortArray2(int[] array) {
        // use Arrays.sort() instead
        Arrays.sort(array);
        return array;
    }


    // main method
    public static void main(String[] args) {
        // create a new array with some values
        int[] someArray = {104, 32, 5, 8, 7};

        // print each value in that array
        arrayPrintEachValue(someArray);

        System.out.println();
        // another way to print the previous array
        arrayPrint(someArray);

        System.out.println();
        // return highest and lowest numbers in the array
        System.out.println(arrayReturnHighLow(someArray));

        System.out.println();
        // create a random array with 5 elements
        int[] anotherArray = createRandomArray(5);
        // print the newly created random array
        System.out.println(Arrays.toString(anotherArray));

        System.out.println();
        // sort the array from lowest to highest number
        System.out.println(Arrays.toString(sortArray(anotherArray)));

    }
}
