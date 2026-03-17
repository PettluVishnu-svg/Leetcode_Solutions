// LeetCode: 300. Longest Increasing Subsequence
// Topic: Dynamic Programming
// Approach: 1D DP (Bottom-Up)
// Idea: For each element, find the longest increasing subsequence ending at that index
// Time Complexity: O(n^2)
// Space Complexity: O(n)

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        // dp[i] = length of LIS ending at index i
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        // Build DP array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }

        // Find maximum LIS
        int longest = Integer.MIN_VALUE;
        for (int val : dp) {
            longest = Math.max(longest, val);
        }

        return longest;
    }
}