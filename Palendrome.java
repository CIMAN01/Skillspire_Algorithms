/*

Create a method that takes a string.
Return true if the string is a palindrome.
Otherwise return false

*/

public class Palindrome {

    // a method that checks for a palendrome match
    public static boolean isPalindrome(String input) {
        // remove spaces from string and change to lower case
        String str = input.replaceAll("\\s","").toLowerCase();
        // create an empty string
        String reversed = "";
        // reverse the string using a for loop
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        // check if condition holds true for a palindrome
        if (reversed.equals(str)) {
            // if it does boolean method returns true
            return true;
        }
        // otherwise return false
        return false;
    }

    // main method
    public static void main(String[] args) {
        // create a palindrome
        String sentence = "\nAble was I ere I saw Elba";
        // print the palindrome
        System.out.println(sentence);
        System.out.println();
        // invoke the method
        System.out.println("is a Palindrome? : " + isPalindrome(sentence));
    }

}
