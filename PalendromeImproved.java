/*

Improved version of Palindrome.java using a faster algorithm.

*/

public class PalindromeImproved {

    public static boolean isPalindrome(String input) {
        // remove spaces from string and change to lower case
        String str = input.replaceAll("\\s","").toLowerCase();
        // create starting and ending indexes
        int left = 0; // left-most index
        int right = str.length()-1; // right-most index
        // check the string for similar characters: start at each end and meet in the middle,
        // while there are still characters left to be compared
        while ((str.charAt(left) == str.charAt(right)) && (left < right)) {
            left++; // traverse right
            right--; // traverse left
        }
        // if not a palindrome (or string already tested) method returns false
        if (left < right) {
            return false;
        }
        // if it is a palindrome method returns true
        return true;
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
