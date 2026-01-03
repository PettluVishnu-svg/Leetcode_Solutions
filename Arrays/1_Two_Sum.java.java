/*
 * Problem: Two Sum
 * Description:
 * Given an array of integers and a target value, return the indices
 * of the two numbers such that they add up to the target.
 *
 * Approach:
 * - Use two nested loops to check all possible pairs
 * - Return indices once a valid pair is found
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        // Problem guarantees a solution, so this line is for safety
        return null;
    }
}
