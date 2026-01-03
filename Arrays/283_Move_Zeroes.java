/*
 * Problem: Move Zeroes
 *
 * Description:
 * Given an integer array `nums`, move all 0's to the end of the array
 * while maintaining the relative order of the non-zero elements.
 *
 * Approach:
 * - Use a pointer `index` to track the position to place non-zero elements
 * - First pass: move all non-zero elements to the front
 * - Second pass: fill the remaining positions with 0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move all non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill the rest with zeros
        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
