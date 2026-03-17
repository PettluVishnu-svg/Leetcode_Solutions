// LeetCode: 2396. Strictly Palindromic Number
// Topic: Math
// Approach: Observation / Mathematical Insight
// Idea: It is proven that no number n >= 4 is strictly palindromic in all bases from 2 to n-2
// Time Complexity: O(1)
// Space Complexity: O(1)

class Solution {
    public boolean isStrictlyPalindromic(int n) {

        // For all n >= 4, result is always false
        return false;
    }
}