// LeetCode: 213. House Robber II
// Topic: Dynamic Programming
// Approach: DP with Two Cases (Circular Constraint)
// Idea: Since houses are in a circle, we cannot rob both first and last house
//       So, solve two linear problems:
//       1. Rob houses from index 0 to n-2
//       2. Rob houses from index 1 to n-1
//       Take the maximum of both
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    // Helper function to solve linear House Robber problem
    public int robHouse(int[] nums, int start, int end) {

        int[] dp = new int[nums.length];

        // Base cases
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);

        // Fill DP array
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[end];
    }

    public int rob(int[] nums) {

        int n = nums.length;

        // Edge cases
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Case 1: Exclude last house
        int val1 = robHouse(nums, 0, n - 2);

        // Case 2: Exclude first house
        int val2 = robHouse(nums, 1, n - 1);

        return Math.max(val1, val2);
    }
}