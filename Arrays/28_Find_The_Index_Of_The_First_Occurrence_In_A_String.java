// LeetCode: 28. Find the Index of the First Occurrence in a String
// Topic: Strings
// Approach: Brute Force String Matching
// Idea: Check every possible starting index in haystack and compare characters with needle
// Time Complexity: O(n * m)
// Space Complexity: O(1)

class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Try every possible starting index
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If full needle matched
            if (j == m) {
                return i;
            }
        }

        // If needle not found
        return -1;
    }
}