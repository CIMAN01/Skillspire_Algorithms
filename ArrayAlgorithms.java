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

// main class
public class ArraysAlgorithm {

    // a method that takes in an array and prints each value in the array
    public static void printEachValueInArray(int[] array) {
        // store last index value in a variable
        int lastIndex = array.length-1;
        // print opening bracket
        System.out.print("[");
        // loop through the entire array minus the last array index
        for (int i = 0; i < array.length-1; i++) { // stop one index short
            // print each value and add a space/comma between them
            System.out.print(array[i] + ", ");
        }
        // print last element in array
        System.out.print(array[lastIndex]);
        // print closing bracket
        System.out.print("]");
    }

    // a method that takes in an array and prints the array using Arrays.toString()
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // a method that returns the highest and lowest number in an array
    public static String returnHighestLowestValueInArray(int[] array) {
        // create a string variable and store the highest and lowest number
        String output = "";
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
        // use string concatenation
        output = "Highest value: " + highest + "\nLowest value: " + lowest;
        // return the resulting string
        return output;
    }

    // a method the creates an array of size int and fills it with random values
    public static int[] createRandomArray(int size) {
        int[] randomArray = new int[size];
        // fill array with random numbers
        for (int i = 0; i < randomArray.length; i++) {
            // use Math.random to get a random number for each index
            randomArray[i] = (int) (Math.random() * 100);
        }
        return randomArray;
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

    // another way to sort an array by using a built-in method
    public static int[] sortArray2(int[] array) {
        // use Arrays.sort() instead
        Arrays.sort(array);
        return array;
    }

    // main method
    public static void main(String[] args) {
        // create a new array with some values
        int[] someArray = {104, 32, 5, 8, 7};

        System.out.println("\nPrinting each value in array: ");
        // print each value in the array
        printEachValueInArray(someArray);

        System.out.println();
        System.out.println("\nanother way of printing the array: ");
        // another way to print the previous array
        printArray(someArray);

        System.out.println();
        // return highest and lowest numbers in the array
        System.out.println(returnHighestLowestValueInArray(someArray));

        System.out.println();
        // create a random array with 5 elements
        int[] anotherArray = createRandomArray(5);
        System.out.println("A randomly created array: ");
        // print the newly created random array
        System.out.println(Arrays.toString(anotherArray));

        System.out.println();
        System.out.println("Sorting the array from lowest to highest: ");
        // sort the array from lowest to highest number
        System.out.println(Arrays.toString(sortArray(anotherArray)));

        System.out.println();
        System.out.println("Another way of sorting the array using built-in method: ");
        // another way to sort the previous array
        System.out.println(Arrays.toString(sortArray2(anotherArray)));
    }

}
