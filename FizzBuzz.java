/*
    Create a fizzBuzz method that takes an integer. Print numbers 0 up to
    and including the number passed in the argument. BUT for each number
    that is divisible by 3, print "FIZZ" instead of that number. For each
    number that is divisible by 5, print "BUZZ" instead of that number.
    And for each number divisible by both 3 and 5 print "FIZZBUZZ" instead
    of that number.

*/

public class FizzBuzz {

    // fizzBuzz method
    public static void fizzBuzz(int num) {
        // a for loop that iterates from 0 from up to the num passed in the argument
        for (int i = 0; i <= num; i++) {
            // If i is divisible by 3 AND 5, print FIZZBUZZ
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            }
            // If i is divisible by 3, print FIZZ
            else if (i % 3 == 0) {
                System.out.println("FIZZ");
            }
            // If i is divisible by 5, print BUZZ
            else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }
            // Otherwise print the number that i represents
            else {
                System.out.println(i);
            }
        }
        
    }

    // use ternary operator
    public static void fizzBuzzTernary(int highestNumber) {
        for (int i = 1; i <= highestNumber; i++) {
            String fizzCheck = "";
            fizzCheck += (i % 3) == 0 ? "fizz" : "";
            fizzCheck += (i % 5) == 0 ? "buzz" : "";
            System.out.println(!fizzCheck.isEmpty() ? fizzCheck : i);
        }
    }

    // main method
    public static void main(String[] args) {
        fizzBuzz(15);
        fizzBuzzTernary(15);
    }

}
