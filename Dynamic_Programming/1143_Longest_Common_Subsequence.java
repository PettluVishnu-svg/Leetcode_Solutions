// LeetCode: 1143. Longest Common Subsequence
// Topic: Dynamic Programming / Strings
// Approach: 2D DP (Bottom-Up)
// Idea: If characters match → take diagonal +1, else take max of left and top
// Time Complexity: O(n * m)
// Space Complexity: O(n * m)

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        // DP table
        int[][] dp = new int[n + 1][m + 1];

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // If characters match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }

                // If characters do not match
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }
}