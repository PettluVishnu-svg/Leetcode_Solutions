// LeetCode: 62. Unique Paths
// Topic: Dynamic Programming / Grid
// Approach: 2D DP (Bottom-Up)
// Idea: Number of ways to reach a cell = ways from top + ways from left
// Time Complexity: O(m * n)
// Space Complexity: O(m * n)

class Solution {
    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m + 1][n + 1];

        // Base case: First row
        for (int j = 1; j <= n; j++) {
            dp[1][j] = 1;
        }

        // Base case: First column
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }

        // Fill DP table
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {

                // Paths from top + Paths from left
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m][n];
    }
}