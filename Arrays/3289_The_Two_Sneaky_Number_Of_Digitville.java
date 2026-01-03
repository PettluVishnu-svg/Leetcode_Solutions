/*
 * Problem: Get Sneaky Numbers
 *
 * Description:
 * Given an integer array `nums`, return an array containing the two numbers
 * that appear more than once in the array.
 *
 * Approach:
 * - Use two nested loops to compare every pair of elements.
 * - When a duplicate is found, store it in the result array.
 * - Stop once both duplicate numbers are collected.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int count = 0;

        for (int i = 0; i < nums.length && count < 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result[count++] = nums[i];
                    break;
                }
            }
        }
        return result;
    }
}
