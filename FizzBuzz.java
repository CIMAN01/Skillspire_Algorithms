/**
 Common interview question:
 Print number 1 to 100
 if the number is divisible by 3, print Fizz
 if the number is divisible by 5, print Buzz
 if it's divisible by both, print FizzBuzz
 **/

/*
Create a fizzBuzz method that takes an integer.
Print numbers 0 up to and including the number passed in the argument.
BUT for each number that is divisible by 3, print "FIZZ" instead of that number.
For each number that is divisible by 5, print "BUZZ" instead of that number.
And for each number divisible by both 3 and 5 print "FIZZBUZZ" instead of that number.
 */

public class FizzBuzz {

    public static void FizzBuzz(int num){
        // loop through num
        for (int i = 0; i <= num; i++) {
            // must start with && logic to get proper output
            if ((num % 3 == 0) && (num % 5 == 0))
                System.out.println("FizzBuzz");
            else if (num % 3 == 0)
                System.out.println("Fizz");
            else if (num % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(num);
        }
    }

    public static void main(String[] args) {
        FizzBuzz(15);
    }

/*
Output:

1
2
FIZZ
4
BUZZ
FIZZ
7
8
FIZZ
BUZZ
11
FIZZ
13
14
FIZZBUZZ
         */

}
