// LeetCode: 48. Rotate Image
// Topic: Arrays / 2D Arrays / Matrix
// Approach: Transpose + Reverse rows
// Idea: First transpose the matrix, then reverse each row to get a 90° clockwise rotation
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
