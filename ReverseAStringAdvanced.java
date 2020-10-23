/*

Challenge:

Given a string with numbers, letters, and special characters, reverse the string BUT keep
the special characters where they are.

Example 1:

Input -  abc123!!!
Output - 321cba!!!

Example 2:

Input -  f3$%cat!no&
Output - on$%tac!3f&

*/

/*

Solution:

The idea here is to break up the String into an array of characters that can be
individually checked against the given condition (whether it should stay in same position
(if it's a special character) or if it should be reversed (if character is alphanumeric)
and the condition check will carried out using a separate boolean method that checks each
character). Based on the condition check, each element will either stay in same index or be
moved into a different slot (character being swapped). Once all the array elements are in
their proper respective indexes (String having been reversed), the array needs to be converted
back into a String to be returned by the method.

*/

// main class
public class ReverseAStringAdvanced {

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
        for (int i = 0; i <= str.length()-1; i++) {
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

        // return the values of the array in string format using built-in method
//        return String.valueOf(arr);

        // create a new empty String
        String reverse = "";
        // loop through the array
        for (int i = 0; i < arr.length-1; i++) {
            // and concatenate or add each character to the String
            reverse += arr[i];
        }
        // return the reversed String
        return reverse;
    }
    
    /* below is a slightly different method of the above using a while-loop instead of a for-loop */
    
    / a method that reverses a string except for special characters
    public static String reverseLettersAndNumbersOnly(String str) {
        // handling base case of an empty string
        if (str == null || str.length() == 0) {
            return str;
        }
        // convert string to an array of characters
        char[] chars = str.toCharArray();
        // create two pointers
        int left = 0; // left pointer starting at the beginning of the string/array
        int right = chars.length - 1; // right pointer starting at the end of the string/array
        // loop through array while left pointer is less than right pointer
        while (left < right) {
            // if characters at left and right indexes are both regular characters we reverse them
            if (isAlphaNumeric(chars[left]) && isAlphaNumeric(chars[right])) {
                // put that left-th index into a temporary variable
                char temp = chars[left];
                // replace left-th index with right-th index
                chars[left] = chars[right];
                // replace right-th index with original left-th index
                chars[right] = temp;
                // move to the next/previous character
                left++; // increment left pointer
                right--; // decrement right pointer
            }
            // if left-th index is a special character
            else if (!isAlphaNumeric(chars[left])) {
                // skip to the next character
                left++; // move left pointer to the right by incrementing it
            }
            // if j-th index is a special character
            else if (!isAlphaNumeric(chars[right])) {
                // skip to the next character
                right--; // move right pointer to the left by decrementing it
            }
        }
        /* **** three different ways to convert an array of characters to a string *****/
        // method one for converting array of characters to a string (creating a new string)
        String reversed1 = new String(chars);
        // method two for converting array of characters to a string (using copyValueOf)
        String reversed2 = String.copyValueOf(chars);
        // method three for converting array of characters to a string (using a string builder)
        StringBuilder sb = new StringBuilder();
        // for-each loop
        for (char ch: chars) {
            sb.append(ch);
        }
        String reversed3 = sb.toString(); // use toString()
        // return string based on chosen method shown above
        return reversed2;
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
