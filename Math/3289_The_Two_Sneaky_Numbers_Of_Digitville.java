/*
 * Problem: Get Sneaky Numbers
 *
 * Description:
 * Given an integer array `nums` where exactly two numbers appear more than once,
 * return those two duplicate numbers in an array.
 *
 * Approach:
 * 1. Use two nested loops to compare each element with the rest.
 * 2. When a duplicate is found, store it in the result array.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result[index++] = nums[i];
                    break; // avoid storing same duplicate multiple times
                }
            }
        }
        return result;
    }
}
