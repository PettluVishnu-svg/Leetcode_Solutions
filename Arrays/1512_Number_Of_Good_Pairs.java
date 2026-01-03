/*
 * Problem: Number of Good Pairs
 *
 * Description:
 * Given an array `nums`, return the number of "good pairs" (i, j) 
 * where nums[i] == nums[j] and i < j.
 *
 * Approach:
 * - Use two nested loops to check all pairs
 * - Increment `count` when a pair is identical
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
