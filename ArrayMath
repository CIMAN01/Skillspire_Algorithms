/**
 * Create a method that takes an array of numbers. Return the sum of the numbers.
 * Invoke the function an print the value.
 *
 * Bonus:
 * Create a method that takes two arrays of numbers.
 * Return the sum of the first array multiplied by the sum of the second array.
 *
 * Example input: {3, 2, 1}, {4, 5}
 *
 * Example output: 54
 *
 * Explanation:
 * 3+2+1 = 6  and 4+5=9
 * 6 x 9 = 54
 *
 **/

public class ArrayMath {
    // a method that takes an array of numbers and returns the sum
    public static int arraySum(int[] arr) {
        // a variable to hold sum
        int sum = 0;
        // loop through the array
        for (int i = 0; i < arr.length; i++) {
            // add each number from array to get total sum
            sum += arr[i];
        }
        return sum;
    }

    // a method that takes in two arrays and returns the sum of the first array multiplied
    // by the sum of the second array
    public static int doubleArraySum(int[] arrOne, int[] arrTwo) {
        // variables to hold first and second sum
        int sumOne = 0;
        int sumTwo = 0;
        // loop through the first array
        for (int i = 0; i < arrOne.length; i++) {
            // add each number from first array to get total sum
            sumOne += arrOne[i];
        }
        // loop through the second array
        for (int i = 0; i < arrTwo.length; i++) {
            // add each number from second array to get total sum
            sumTwo += arrTwo[i];
        }
        // return the result of multiplication of arrays
        return sumOne * sumTwo;
    }

    // run main program
    public static void main(String[] args) {
        // create an array with some numbers
        int[] someNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // output should be 45
        // invoke method arraySum and display the sum
        System.out.println(arraySum(someNumbers));
        System.out.println("------------------  BONUS: --------------------");
        // create two array with some numbers
        int[] firstArray = {3, 2, 1};
        int[] secondArray = {4, 5};
        // invoke the method doubleArraySum and display the result
        System.out.println(doubleArraySum(firstArray, secondArray)); // output should be 54
    }
}
