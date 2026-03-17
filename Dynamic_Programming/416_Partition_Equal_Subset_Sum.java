// LeetCode: 416. Partition Equal Subset Sum
// Topic: Dynamic Programming / Subset Sum
// Approach: 1D DP (Knapsack)
// Idea: Convert the problem into finding a subset with sum = totalSum / 2
// Time Complexity: O(n * target)
// Space Complexity: O(target)

class Solution {
    public boolean canPartition(int[] nums) {

        long sum = 0;

        // Step 1: Calculate total sum
        for (int num : nums) {
            sum += num;
        }

        // If sum is odd, cannot partition into equal subsets
        if ((sum & 1) == 1) return false;

        int target = (int) (sum / 2);

        // Step 2: DP array where dp[i] means subset sum i is possible
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        // Step 3: Fill DP array
        for (int item : nums) {

            // Traverse backwards to avoid overwriting
            for (int v = target; v >= item; v--) {
                dp[v] = dp[v] || dp[v - item];
            }
        }

        return dp[target];
    }
}