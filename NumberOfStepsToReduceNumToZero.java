/*

Steps to reduce num to 0
Given a non-negative integer num, return the number of steps to reduce it to zero.
If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

Example 1:
		Input: num = 14
		Output: 6
		Explanation:
		Step 1) 14 is even; divide by 2 and obtain 7.
		Step 2) 7 is odd; subtract 1 and obtain 6.
		Step 3) 6 is even; divide by 2 and obtain 3.
		Step 4) 3 is odd; subtract 1 and obtain 2.
		Step 5) 2 is even; divide by 2 and obtain 1.
		Step 6) 1 is odd; subtract 1 and obtain 0.

Example 2:
		Input: num = 8
		Output: 4
		Explanation:
		Step 1) 8 is even; divide by 2 and obtain 4.
		Step 2) 4 is even; divide by 2 and obtain 2.
		Step 3) 2 is even; divide by 2 and obtain 1.
		Step 4) 1 is odd; subtract 1 and obtain 0.

Example 3:
		Input: num = 123
		Output: 12

 */

public class NumberOfStepsToReduceNumToZero {

    // steps to reduce num to 0 given a non-negative integer num, return the number of steps to
    // reduce it to zero. If the current number is even, you have to divide it by 2, otherwise,
    // you have to subtract 1 from it.

    // a method that returns the number of steps it takes to reduce an input number to zero
    public static int findNumOfStepsByReduction(int num) {
        // create a variable steps and initialize it to zero
        int steps = 0;
        // cover the base case with an if statement
        if (num < 2) {
            return -1;
        }
        // while the input number has not been fully reduced to zero
        while (num > 0) {
            // if the number is even
            if (num % 2 == 0) {
                // divide it in half
                num = num / 2;
            }
            // otherwise subtract one from it
            else {
                num = num - 1;
            }
            // increment the steps
            steps++;
        }
        // return the number of steps it took to reduce the input number to zero
        return steps;
    }

    // using recursion (more advanced)...

    // we could do it iteratively, but it is somewhat more elegant to use recursion here,
    // as the numbers are not too big, assuming only 32 recursive calls at most
    public static int findNumOfStepsByRecursion(int num) {
        // base case, if num is 0 return 0, if num is 1 return 1
        if (num < 2) {
            return num;
        }

        // recursive case: if num is odd, do -1 and divide by two then recurse (2 operations)
        // if even, only divide by 2 and recurse (1 operation )
        // note 1: num >> 1 takes care of both cases since it is truncated division by 2
        // note 2: num % 2 == 1 is the same as (num & 1) == 1

        return findNumOfStepsByRecursion(num >> 1) + (((num & 1) == 1) ? 2 : 1);
    }

    // main method
    public static void main(String[] args) {
        // number variables
        int numberOne = 123;
        int numberTwo = 8;
        // invoke method and print to console
        System.out.println(findNumOfStepsByReduction(numberOne));
        System.out.println(findNumOfStepsByRecursion(numberTwo));
    }

}
