// LeetCode: 198. House Robber
// Topic: Dynamic Programming
// Approach: Bottom-Up DP
// Idea: At each house, decide whether to rob it (and skip previous) or skip it
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        // Edge cases
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[n];

        // Base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Fill DP array
        for (int i = 2; i < n; i++) {

            // Either rob current house + dp[i-2] OR skip current house
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}