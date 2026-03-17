// LeetCode: 64. Minimum Path Sum
// Topic: Dynamic Programming / Grid
// Approach: In-place DP (Bottom-Up)
// Idea: Each cell stores the minimum cost to reach it from top or left
// Time Complexity: O(m * n)
// Space Complexity: O(1) (in-place modification)

class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // Fill first column
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // Fill first row
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        // Fill rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                // Take minimum of top and left
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        // Bottom-right cell contains the answer
        return grid[m - 1][n - 1];
    }
}