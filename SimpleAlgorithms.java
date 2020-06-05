/*

Easy in-class algorithm practices:

1. create a method that takes a positive number and logs from 0 up to that #

2. create a method that takes an array of strings and returns true if all strings have a
   length of three.

*/

// main class
public class SimpleAlgorithms {

    // a method that takes a positive number and logs from 0 up to that number
    public static void numLog (int num){
        // use a for loop
        for (int i = 0; i < num; i++) {
            // print to console
            System.out.println(i);
        }
    }

    // a method that takes an array of strings and returns true if all strings have a
    // length of three.
    public static boolean areAllStringsInArrayEqual(String[] arr) {
        // iterate over the array
        for (int i = 0; i <= arr.length; i++) {
            // return false if any one string does not have a length of three
            if(arr[i].length() != 3) {
                return false;
            }
        }
        // otherwise all strings have an equal length and true is returned
        return true;
    }

    // main method
    public static void main(String[] args) {
        // log up to num
        numLog(20);
        // create even and odd arrays of strings
        String[] namesEven = {"get", "see", "mad"};
        String[] namesOdd = {"travel", "to", "park"};
        // invoke methods and print to console
        System.out.println(areAllStringsInArrayEqual(namesEven));
        System.out.println(areAllStringsInArrayEqual(namesOdd));
    }

}
