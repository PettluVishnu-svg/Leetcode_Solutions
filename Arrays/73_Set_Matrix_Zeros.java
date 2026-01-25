// LeetCode: 73. Set Matrix Zeroes
// Topic: Arrays / 2D Arrays / Matrix
// Approach: In-place marking using first row and first column
// Idea: Use the first row and column as markers to avoid extra space
// Time Complexity: O(m * n)
// Space Complexity: O(1)

class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Flag to track if first column needs to be zeroed
        int col0 = 1;

        // Step 1: Mark rows and columns using first row and column
        for (int i = 0; i < m; i++) {

            // Check if first column needs to be zero
            if (matrix[i][0] == 0) {
                col0 = 0;
            }

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 2: Update the inner matrix based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Handle the first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle the first column
        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
