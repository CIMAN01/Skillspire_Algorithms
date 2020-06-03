/*

Given a string of numbers, letters, and special characters, reverse the string BUT
keep the first character where it is.

Example 1:
Input - abc123!!!
Output - a!!!321cb

Example 2:
Input - fat!cat
Output - ftac!ta

*/

public class ReverseAStringEasy {

    // a method that reverses a string without affecting first character
    public static String reverseString(String str) {
        // using built in method to convert the given string into a sequence of characters
//        char[] arr = str.toCharArray();

        // create an array of characters with a length equal to the input String

        char[] arr = new char[str.length()];

        // iterate over the input String and add each character to the array
        for (int i = 0; i <= str.length()-1; i++) {
            arr[i] = str.charAt(i);
        }

        // create a new empty string
        String arrReversed = "";

        // add the very first index of the input array to new string
        arrReversed += arr[0];

        // then loop through array starting at end and up to (but not including) the first character
        for (int i = str.length()-1; i >= 1; i--) {
            // add each character to string in the proper order to the new string
            arrReversed += arr[i];
        }

        // return the reversed String
        return arrReversed;
    }

    // main method
    public static void main(String[] args) {
        // create two string examples
        String input1 = "abc123!!!"; // abc123!!!
        String input2 = "fat!cat"; // fat!cat

        // print the original string and then invoke the method to print it reversed
        System.out.println("Original String : " + input1);
        System.out.println("Reversed String : " + reverseString(input1)); // a!!!321cb

        // print the original string and then invoke the method to print it reversed
        System.out.println("Original String : " + input2);
        System.out.println("Reversed String : " + reverseString(input2)); // ftac!ta
    }

}
