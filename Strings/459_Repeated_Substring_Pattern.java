// LeetCode: Repeated Substring Pattern
// Topic: Strings
// Approach: String manipulation using concatenation
// Idea: If the string is formed by repeating a substring,
//       it will exist inside (s + s) after removing first and last characters
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean repeatedSubstringPattern(String s) {

        // Concatenate the string with itself
        String str = s + s;

        // Remove first and last characters
        String sub = str.substring(1, str.length() - 1);

        // Check if original string exists in the modified string
        return sub.contains(s);
    }
}
