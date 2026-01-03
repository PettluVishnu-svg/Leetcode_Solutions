/*
 * Problem: Missing Number
 *
 * Description:
 * Given an array containing n distinct numbers taken from 0 to n,
 * find the number that is missing from the array.
 *
 * Approach:
 * - Use XOR to find the missing number:
 *   - XOR all numbers from 0 to n
 *   - XOR all numbers in the array
 *   - XOR of these two results gives the missing number
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int missingNumber(int[] nums) {
        int xorArray = 0;
        int xorRange = 0;

        for (int i = 0; i < nums.length; i++) {
            xorArray ^= nums[i];      // XOR of all elements in array
            xorRange ^= (i + 1);      // XOR of all numbers from 1 to n
        }

        // XOR of array XOR range gives the missing number
        return xorArray ^ xorRange;
    }
}
