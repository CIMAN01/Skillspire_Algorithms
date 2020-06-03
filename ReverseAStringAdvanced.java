/*

Given a string with numbers, letters, and special characters, reverse the string BUT keep the
special characters where they are.

Example 1:

Input -  abc123!!!
Output - 321cba!!!

Example 2:

Input -  f3$%cat!no&
Output - on$%tac!3f&

*/


// main class
public class ReverseStringAdvanced {

//    String specialChars = "A!@#$% ^&*()Z";

    // a method that checks for special characters using the ASCII chart
    public static boolean isAlphaNumeric(char ch) {
        // check the character input ch against given range of alphanumerical characters:
        //     Numeric 0 to 9      || Alphabet A to Z (caps) ||     Alphabet a to z
        if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))  {
            // if it's within the range it is true that it is an alphanumerical value
            return true;
        }
        // if it's not within the range it is not an alphanumerical value
        return false;
    }

    // a method that reverses a string without affecting special characters
    public static String reverseString(String str) {

        // using built in method to convert the given string into a sequence of characters
//        char[] arr = str.toCharArray();

        // create an array of characters with a length equal to the input String
        char[] arr = new char[str.length()];

        // iterate over the input String and add each character to the array
        for (int i = 0; i < str.length()-1; i++) {
            arr[i] = str.charAt(i);
        }

        // loop through array i start at first index and j start at last index
        for (int i = 0, j = str.length()-1; i < j;) {
            // if i and j indexes are both regular characters we reverse them:
            if (isAlphaNumeric(arr[i]) && isAlphaNumeric(arr[j])) {
                // put that i-th index into a temporary variable
                char temp = arr[i];
                // replace i-th index with j-th index
                arr[i] = arr[j];
                // replace j-th index with original i-th index
                arr[j] = temp;
                // move to the next character
                i++; // move index i to right by incrementing it
                j--; // and move index j to left by decrementing it
            }
            // if i-th index is a special character
            else if (!isAlphaNumeric(arr[i])) {
                // skip to the next character
                i++; // move index i to the right by incrementing it
            }
            // if j-th index is a special character
            else if (!isAlphaNumeric(arr[j])) {
                // skip to the next character
                j--; // move index j to the left by decrementing it
            }
        }
        // return the values of the array in string format
        return String.valueOf(arr);
    }


    // main method
    public static void main(String[] args) {
        // create two string examples
        String input1 = "abc123!!!"; // abc123!!!
        String input2 = "f3$%cat!no&"; // f3$%cat!no&

        // print the original string and then invoke the method to print it reversed
        System.out.println("Original String : " + input1);
        System.out.println("Reversed String : " + reverseString(input1)); // 321cba!!!

        // print the original string and then invoke the method to print it reversed
        System.out.println("Original String : " + input2);
        System.out.println("Reversed String : " + reverseString(input2)); // on$%tac!3f&
    }

}
