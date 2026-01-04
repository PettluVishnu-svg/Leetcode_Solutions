/*
 * Problem: Number of Good Pairs
 *
 * Description:
 * Given an integer array `nums`, a pair (i, j) is called good if:
 * - nums[i] == nums[j]
 * - i < j
 *
 * Return the total number of good pairs.
 *
 * Approach:
 * Use two nested loops to compare each element with the elements
 * that come after it.
 *
 * Time Complexity: O(n²)
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
