/*

Decompress Run-Length Encoded List

We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).

For each such pair, there are freq elements with value val concatenated in a sublist.

Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

	Example 1:

		Input: nums = [1,2,3,4]
		Output: [2,4,4,4]

		Explanation:
		The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
		The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
		At the end the concatenation [2] + [4,4,4] is [2,4,4,4].

	Example 2:

		Input: nums = [1,1,2,3]
		Output: [1,3,3]

Hint:

Decompress the given array by repeating nums[2*i+1] a number of times equal to nums[2*i].

*/

import java.util.Arrays;

// main class
public class DecompressEncodedList {

    // a method that takes a list (array), then concatenates sub-lists (from left to right)
    // to generate a decompressed list: [1,2,3,4] -> [1,2] and [3,4] -> [2,4,4,4]
    public static int[] decompressList(int[] nums) {

        //  even numbers (0, 2, 4,...) -> index element is the frequency
        //  odd numbers (1, 3, 5,...) -> index element is the value

        // [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).

        // create a sum variable and initialize to 0
        int sum = 0;
        // loop through the original list array

        for (int i = 0; i < nums.length; i += 2) {
            // add every other i-th element to sum
            sum += nums[i];
        }

        // create a new array of sum length
        int[] array = new int[sum];

        // create a index variable and initialize to 0
        int index = 0;

        // outer loop where we iterate every other i-th element
        for (int i = 0; i < array.length; i += 2) {
            // frequency = num[i]
            int freq = nums[i];
            // value = num[i + 1]
            int val = nums[i + 1];
            // inner loop where we add the value x amount of times (x = frequency)
            for (int j = 0; j < freq; j++) {
                // add value to the appropriate index in the array (then increment the index)
                array[index++] = val;
            }
        }

        // return the the compressed list array
        return array;

    }

    // main method
    public static void main(String[] args) {

        // create an array with values from example 1
        int[] inputArray1 = {1, 2, 3, 4}; // input: [1,2,3,4]
        // create an array with values from example 1
        int[] inputArray2 = {1, 1, 2, 3}; // input: [1,1,2,3]

        // invoke the method and print the resulting output fo example 1
        System.out.println(Arrays.toString(decompressList(inputArray1))); // output: [2,4,4,4]
        // invoke the method and print the resulting output fo example 2
        System.out.println(Arrays.toString(decompressList(inputArray2))); // output:  [1,3,3]

    }

}
