/*

https://leetcode.com/problems/reverse-words-in-a-string/

Input: "the sky is blue"
Output: "blue is sky the"

*/

// main class
public class ReverseAStringByWords {

    // a method that reverses words of a string literal
    static String reverseWords(String text) {
        // split the string whenever whitespace is found and store each word in an array
        String[] array = text.split("\\s");
        // create an empty String
        String reversedWords = "";
        // loop through the array by starting at the end of the text and iterating backwards
        for (int i = array.length-1; i >= 0; i--) { 
            // add each word in reverse order with a space between them
            reversedWords += " " + array[i];
        }
        // return the text with the words reversed
        return reversedWords;
    }

    // main method
    public static void main(String[] args) {
        // create a String literal
        String literal = "the sky is blue";
        // invoke the method and print to the text with the words reversed
        System.out.println(reverseWords(literal)); // output should be "blue is sky the"
    }

}
