// LeetCode: 1769. Minimum Number of Operations to Move All Balls to Each Box
// Topic: Arrays
// Approach: Brute force using nested loops
// Idea: For each box, calculate the total distance from all boxes containing balls
// Time Complexity: O(n^2)
// Space Complexity: O(n)

import java.util.Arrays;

class Solution {
    public int[] minOperations(String boxes) {

        int[] answer = new int[boxes.length()];

        // Initialize answer array with zeros
        Arrays.fill(answer, 0);

        // For each box
        for (int i = 0; i < answer.length; i++) {

            // Check distance from all other boxes
            for (int j = 0; j < answer.length; j++) {

                // If a ball exists at position j, add distance
                if (boxes.charAt(j) == '1') {
                    answer[i] += Math.abs(i - j);
                }
            }
        }

        return answer;
    }
}
