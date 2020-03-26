import java.util.ArrayList;

public class Algorithms {
    
    public static void main(String[] args) {
        // strings
        String someTestString = "hey this!is!some!text!";
        String[] testArr = someTestString.split("");

        String exclamations = "";

        for (int i = 0; i < testArr.length; i++) {
            if (testArr[i].equals("!")) {
                exclamations += testArr[i];
            }
        }

        System.out.println(exclamations);

        System.out.println(updatePhoneNumber("(425) 223-2323"));

        ArrayList<String> movieCharacters = new ArrayList<>();
        movieCharacters.add("Neo");
        movieCharacters.add("Morpheus");
        movieCharacters.add("Zaphod");
        movieCharacters.add("Batman");

        logNames(movieCharacters);

    }


    // Input1: "(425)-323-2323"
    // Input2: "425 323-2323"
    // Input3: "(425) 323-2323"

    /*
        Option 1:
        1. Change the string to an array of strings.
            - ["(", "4", "2", "5", " "....]
        2. Create a loop to go through the array
        3. If you find any of these: (,),-," ". Change it to "".

        Option 2:
        1. Create empty string and assign it to a variable
        2. Loop through the existing input and, if a character is an integer,
           concatenate that value to the empty string variable
        3. Return that variable
        
    */
    

    /*
        Uber App

        - Uber Application asks for phone number
            - Logic in form

        - Uber sends that data to Lexus Nexus

        - Lexus Nexus has their own expected data format
    */

    public static String updatePhoneNumber(String phoneNumber) {
        // "(425) 223-2323"
        String output = "";
        // use split()
        String[] inputToArr = phoneNumber.split("");
        // inputToArr = ["(", "4", "2", "5", ")", " ", "2", "2", "3", "-", "2", "3", "2", "3"]
        for (int i = 0; i < inputToArr.length; i++) {
            // if block
            if (!(inputToArr[i].equals("(") || inputToArr[i].equals(")") || inputToArr[i].equals("-") || inputToArr[i].equals(" "))) {
                output += inputToArr[i];
            }
        }
        return output;
    }

    // Create a method that takes an ArrayList of names. Print each name in the ArayList on a separate line.
    public static void logNames(ArrayList<String> names) {
        for (String name: names) {
            System.out.println(name);
        }
    }
}
