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

public class Challenge4 {

    //Steps to reduce num to 0
    //Given a non-negative integer num, return the number of steps to reduce it to zero.
    //If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

    public static int reduceNumberToZero(int num) {

        int steps = 0;

        if (num < 2) {
            return -1;
        }

        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
    
    // using recursion (more advanced)
    public static int reduceNumberToZero2(int num) {

        // we could do it iteratively,
        // but it is somewhat more elegant to use recursion here,
        // as the numbers are not too big (int),
        // so assuming only 32 recursive calls at most.

        // base case, if num is 0 return 0, if num is 1 return 1
        if (num < 2) {
            return num;
        }

        // recursive case, if num is odd, do -1 and divide
        // by two then recurse (2 ops),
        // if even, only divide by 2 and recurse (1 op)
        // note 1: num >> 1 takes care of both cases
        // since it is truncated division by 2.
        // note 2: num % 2 == 1 is the same as (num & 1) == 1,
        // I don't have a personal preference for either.
        return reduceNumberToZero2(num >> 1) + (((num & 1) == 1) ? 2 : 1);
    }
    
      public static void main(String[] args) {

        int number = 123;
        System.out.println(reduceNumberToZero(number));
        //System.out.println(reduceNumberToZero2(number));

    }

}
