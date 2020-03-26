/*

Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

	EXAMPLE 1:
		Input: nums = [8,1,2,2,3]
		Output: [4,0,1,1,3]

		Explanation:
		For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
		For nums[1]=1 does not exist any smaller number than it.
		For nums[2]=2 there exist one smaller number than it (1).
		For nums[3]=2 there exist one smaller number than it (1).
		For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

	EXAMPLE 2:
		Input: nums = [6,5,4,8]
		Output: [2,1,0,3]

	EXAMPLE 3:
		Input: nums = [7,7,7,7]
		Output: [0,0,0,0]

 */

import java.util.Arrays;

public class ArrayChallenge {

    // Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
    // That is, for each nums[i] you have to count the number of valid j's such that j != i
    // and nums[j] < nums[i]. Return the answer in an array.

    public static int[] countSmallerNumbersAfterSelf(int[] arr) {
        // create a new array and give it the old array's length
        int[] newArr = new int[arr.length];
        // create a count variable
        int count = 0;
        // create two loops to compare the array with itself
        for (int i = 0; i < arr.length; i++) {
            // inner loop
            for (int j = 0; j < arr.length; j++) {
                // if j != i and nums[j] < nums[i]
                if((j!=i) && (arr[j] < arr[i])) {
                    // increment count
                    count++;
                }
            }
            // set the ith element the value of count
            newArr[i] = count;
            // reset count after loop
            count = 0;
        } // return the new array
        return newArr;
    }

    // main method
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(countSmallerNumbersAfterSelf(nums))); // [4,0,1,1,3]
    }
}
