// LeetCode: 931. Minimum Falling Path Sum
// Topic: Dynamic Programming / Grid
// Approach: 2D DP (Bottom-Up)
// Idea: Each cell takes minimum from top, top-left, and top-right
// Time Complexity: O(n * m)
// Space Complexity: O(n * m)

class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        // Edge case
        if (n == 1 && m == 1) return matrix[0][0];

        int[][] dp = new int[n][m];

        // Initialize first row
        for (int j = 0; j < m; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // From top
                int up = dp[i - 1][j];

                // From top-left
                int leftDiag = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE;

                // From top-right
                int rightDiag = (j < m - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(leftDiag, rightDiag));
            }
        }

        // Find minimum in last row
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }

        return min;
    }
}