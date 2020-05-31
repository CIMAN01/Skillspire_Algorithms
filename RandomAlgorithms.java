/* 

In-class algorithm challenges via zoom app (day 15):

1. Create a method that takes an integer. Log numbers 0 up to that number.

2. Create a method that takes an array of contacts and logs each contact.
 
3. Create a method that takes an array of numbers. If there is an odd number of values, 
   log the one in the middle.
   
4. Create a method that takes an array of numbers and returns true if all numbers are even. 
   
*/

public class RandomAlgorithms {

    // a method that takes an integer. Log numbers 0 up to that number
    public static void logNumbers(int num) {
        // loop through the numbers
        for (int i = 0; i <= num; i++) {
            // print the i-th value
            System.out.println(i);
        }
    }

    // a method that takes an array of contacts and logs each contact
    public static void logContactArray(String[] contact) {
        // iterate over the array
        for (int i = 0; i < contact.length; i++) {
            // print the i-th contact in the array
            System.out.println(contact[i]);
        }
    }

    // a method that takes an array of numbers and logs the one in the middle if there 
    // is an odd number of values
    public static void logMiddleOddValueInArray(int[] arr) {
        // if array is odd
        if (arr.length % 2 != 0) {
            // store middle index
            int middle = arr.length/2;
            // print middle value
            System.out.println(arr[middle]);
        }
        // the array is even
        else {
            System.out.println("the array has an even number of values");
        }
    }

    // a method that takes an array of numbers and returns true if all numbers are even
    public static boolean isArrayEven(int[] arr) {
        // iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // if a single number is found to be odd
            if (arr[i] % 2 != 0) {
                // the method returns false
                return false;
            }
        }
        // if all numbers are even the method returns true
        return true;
    }

    // main method
    public static void main(String[] args) {
        /* 1. */
        // invoke method
        logNumbers(5);

        /* 2. */
        // create an array
        String[] arr = {"john", "Adam", "Berkley", "Smith"};
        // invoke method
        logContactArray(arr);

        /* 3. */
        // create an array
        int[] numArr = {0, 3, 7, 10, 13, 20, 11};
        // invoke method
        logMiddleOddValueInArray(numArr);

        /* 4. */
        // create even and odd arrays
        int[] numEven = {2, 4, 6, 8, 10};
        int[] numOdd  = {3, 5, 7, 9, 11};
        // invoke the methods and print to console
        System.out.println(isArrayEven(numOdd));
        System.out.println(isArrayEven(numEven));
    }

}
