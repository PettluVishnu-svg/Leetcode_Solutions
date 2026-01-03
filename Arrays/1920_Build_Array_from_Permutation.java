/*
 * Problem: Build Array from Permutation
 *
 * Description:
 * Given a zero-based permutation array `nums` (all integers from 0 to n-1),
 * return an array `ans` such that ans[i] = nums[nums[i]] for each index i.
 *
 * Approach:
 * - Create a result array of the same length
 * - For each index i, set ans[i] = nums[nums[i]]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[nums[i]];
        }

        return arr;
    }
}
