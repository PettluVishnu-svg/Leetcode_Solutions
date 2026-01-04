/*
 * Problem: Palindrome Number
 *
 * Description:
 * Given an integer `x`, return true if it is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * Approach:
 * 1. Reverse the digits of the number.
 * 2. Compare the reversed number with the original value.
 * 3. If both are equal, the number is a palindrome.
 *
 * Time Complexity: O(log₁₀ n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return reversed == original;
    }
}
