/*
 * Problem: Missing Number
 *
 * Description:
 * Given an array `nums` containing `n` distinct numbers taken from
 * the range [0, n], return the one number that is missing from the array.
 *
 * Approach:
 * Use the XOR technique:
 * - XOR all indices from 1 to n
 * - XOR all elements in the array
 * - XOR of both results gives the missing number
 *
 * Reason:
 * a ^ a = 0 and a ^ 0 = a
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int missingNumber(int[] nums) {
        int xorIndex = 0;
        int xorValue = 0;

        for (int i = 0; i < nums.length; i++) {
            xorIndex ^= (i + 1);
            xorValue ^= nums[i];
        }

        return xorIndex ^ xorValue;
    }
}
