/*

Reverse a String by characters

For example:

If the input is "the sky is blue", the output should be "eulb si yks eht".

*/

public class ReverseAStringByChars {

    // a method that reverses the words in a text (String traversal method)
    public static String reverseAString(String text) {
        // create an empty string
        String reversedText = "";
        // begin at the end of string and iterate backwards
        for (int i = text.length()-1; i >= 0; i--) {
            // add each character to string
            reversedText += text.charAt(i);
        }
        // return the reversed string
        return reversedText;
    }

    // main method
    public static void main(String[] args) {
        // create a String literal
        String literal = "the sky is blue"; // input: "the sky is blue"
        // invoke the method and print the reversed text
        System.out.println(reverseAString(literal)); // output: "eulb si yks eht"
    }

}
