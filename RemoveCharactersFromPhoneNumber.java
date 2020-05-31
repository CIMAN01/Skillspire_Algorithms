/*

Challenge:

Take user input for a phone number. Remove the following characters
   and return the number without them:
   (
   )
   -
   (space)
   Example 1:
   		Input: (425)-323-2323
   		Output: 4253232323
   	Example 2:
   		Input: 425 323-2323
   		Output: 4253232323

*/

// main class
public class RemoveCharactersFromPhoneNumber {

    // a method that removes the characters "( ) -" from a phone number
    public static String replacePhoneNumber(String number) {
        // create a regex that holds only numbers and alphabetical characters
        String regex = "[^a-zA-Z0-9]";
        // update number by replacement with regex values
        number = number.replaceAll(regex, "");
        // return the new number without the special characters
        return number;
    }

    // main method
    public static void main(String[] args) {
        String number = "(425)-323-2323";
        System.out.println(replacePhoneNumber(number));
    }

}
