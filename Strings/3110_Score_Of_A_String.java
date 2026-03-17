// LeetCode: 3110. Score of a String
// Topic: Strings
// Approach: Linear Traversal
// Idea: Sum absolute differences of ASCII values of adjacent characters
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int scoreOfString(String s) {

        int sum = 0;

        // Traverse string and calculate score
        for (int i = 0; i < s.length() - 1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return sum;
    }
}