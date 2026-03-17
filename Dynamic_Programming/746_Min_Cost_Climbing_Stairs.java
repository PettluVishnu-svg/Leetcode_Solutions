// LeetCode: 746. Min Cost Climbing Stairs
// Topic: Dynamic Programming
// Approach: Bottom-Up DP (Space Optimized)
// Idea: At each step, choose the minimum cost from the previous two steps
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int s1 = cost[0];  // Cost to reach step 0
        int s2 = cost[1];  // Cost to reach step 1

        // Build solution from step 2 onwards
        for (int i = 2; i < cost.length; i++) {

            cost[i] += Math.min(s1, s2);  // Add min of previous two steps

            s1 = s2;
            s2 = cost[i];
        }

        // Final answer is min cost to reach top from last two steps
        return Math.min(s1, s2);
    }
}