/*

Create a method that takes a string and removes the vowels from the string (a, e, i, o, u)

example:

input  = "abcdDCBA123"
output = "bcdDCBA123"  (

avoid using build-in methods such as str.replace("a", "");

*/

// main class
public class VowelRemover {

    // a method that takes a string and removes the vowels (a, e, i, o, u)
    public static String removeVowels(String str) {
        // change the input String to lower case
        str = str.toLowerCase();
        // create a new empty String
        String noVowelString = "";
        // iterate over each character in the String
        for (int i = 0; i < str.length(); i++) {
            // if it's a vowel it will not be added to the newly created String
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i')
                    || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
                // print the omitted vowels
                System.out.println("following vowel '" + str.charAt(i) + "' removed");
            }
            // else concatenate or add character to the resulting String literal
            else {
                noVowelString += str.charAt(i);
            }
        }
        System.out.print("\nstring with the vowels removed: ");
        // return statement
        return noVowelString;
    }

    // main method
    public static void main(String[] args) {
        // create some random string with vowels
        String aRandomString = "ABCD123aeiouPV";
        // print the original String
        System.out.println("\noriginal string: " + aRandomString);
        System.out.println();
        // invoke the method and print the new String
        System.out.println(removeVowels(aRandomString));
    }

}
