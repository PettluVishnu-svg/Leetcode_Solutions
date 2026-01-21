// LeetCode: 54. Spiral Matrix
// Topic: Arrays / 2D Arrays / Matrix
// Approach: Boundary traversal
// Idea: Traverse the matrix layer by layer while shrinking boundaries
// Time Complexity: O(m * n)
// Space Complexity: O(m * n) for result list

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spiral = new ArrayList<>();

        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;

        // Traverse the matrix in spiral order
        while (left <= right && top <= bottom) {

            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left (if rows remain)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top (if columns remain)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(matrix[i][left]);
                }
                left++;
            }
        }

        return spiral;
    }
}
