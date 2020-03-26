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

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("enter a phone number: ");

        String number = console.nextLine();

        replaceNumber(number);

    }

    public static void replaceNumber(String number) {

        String regex = "[^a-zA-Z0-9]";

        number = number.replaceAll(regex, "");

        System.out.println(number);

    }
}
