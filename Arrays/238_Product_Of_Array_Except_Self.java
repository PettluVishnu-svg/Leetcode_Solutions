/*
 * Problem: Product of Array Except Self
 *
 * Description:
 * Given an array nums of n integers, return an array output such that
 * output[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * Note: Solve without using division (optional), but this solution uses division
 * and handles zeros properly.
 *
 * Approach:
 * - Count the number of zeros in the array
 * - Calculate the product of non-zero numbers
 * - Assign values based on zero count:
 *   - More than 1 zero → all zeros
 *   - Exactly 1 zero → only the zero element gets the product
 *   - No zero → divide total product by current element
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) (for the result array)
 */

class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int product = 1;
        int zeroCount = 0;

        // Compute total product and count zeros
        for (int num : nums) {
            if (num == 0) zeroCount++;
            else product *= num;
        }

        // Fill the result array based on zero count
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                res[i] = 0;
            } else if (zeroCount == 1) {
                res[i] = (nums[i] == 0) ? product : 0;
            } else {
                res[i] = product / nums[i];
            }
        }

        return res;
    }
}
