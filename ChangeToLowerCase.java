/*
   Given a string of mixed-case letters, change any uppercase letters to lowercase.

   Do not use methods to change casing. You'll have to loop through, find uppercase letters,
   and convert them to lowercase.

 */

// main class
public class ChangeToLowerCase {

    // a method that changes uppercase letters to lowercase letters
    public static void changeToLowerCase(String str) {
        // create a new empty string
        String lowerCaseStr = "";
        // loop through each letter
        for (int i = 0; i < str.length(); i++) {
            // create a variable that will hold i-th letter
            char aChar = str.charAt(i);
            // check if letter is uppercase
            if (65 <= aChar && aChar <= 90) {
                // change to lowercase
                aChar = (char) ((aChar + 32)); // cast needed
            }
            // add each lowercase letter to resulting string
            lowerCaseStr += aChar;
        }
        // print the resulting string
        System.out.println(lowerCaseStr);
    }

    // main method
    public static void main(String[] args) {
        // create a string that has a mix of upper- and lowercase letters
        String someStr = "ThisIsASTRING";
        // invoke the method to change all letters to lowercase and print to console
        changeToLowerCase(someStr);

    }
}
