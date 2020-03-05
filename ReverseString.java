
import java.util.Scanner;

public class ReverseString {

    // String traversal method
    public static String reverseString(String text) {
        // create an empty string
        String reversedText = "";
        // begin at the end of string and loop backwards
        for (int i = text.length() - 1; i >= 0; i--) {
            // add each character to string
            reversedText += text.charAt(i);
        }
        // return the reversed string
        return reversedText;

    }

    public static void main(String[] args) {
        // create scanner object
        Scanner console = new Scanner(System.in);
        // enter a string in the console
        System.out.print("Enter a string literal to be reversed: ");
        // read the string
        String text = console.nextLine();
        // invoke the reverseString() method
        String display = reverseString(text);
        // display the reversed string
        System.out.println(display);
    }
}
