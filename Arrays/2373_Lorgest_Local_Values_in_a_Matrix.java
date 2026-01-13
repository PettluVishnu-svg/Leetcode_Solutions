// LeetCode: 2373. Largest Local Values in a Matrix
// Topic: Arrays / 2D Arrays
// Approach: Sliding 3x3 window
// Idea: For each possible 3x3 submatrix, find the maximum value
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

class Solution {
    public int[][] largestLocal(int[][] grid) {

        int n = grid.length;
        int[][] answer = new int[n - 2][n - 2];

        // Traverse each possible 3x3 submatrix
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {

                int maxLocal = Integer.MIN_VALUE;

                // Find maximum in current 3x3 window
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        maxLocal = Math.max(maxLocal, grid[k][l]);
                    }
                }

                answer[i][j] = maxLocal;
            }
        }

        return answer;
    }
}
