/*
 * Problem: Reverse Integer
 *
 * Description:
 * Given a 32-bit signed integer `x`, return its digits reversed.
 * If reversing `x` causes the value to go outside the signed
 * 32-bit integer range [-2³¹, 2³¹ - 1], return 0.
 *
 * Approach:
 * 1. Extract digits one by one using modulo and division.
 * 2. Build the reversed number while checking for overflow.
 * 3. Restore the sign at the end.
 *
 * Time Complexity: O(log₁₀ n)
 * Space Complexity: O(1)
 */

class Solution {

    public int reverse(int x) {
        int num = Math.abs(x);
        int rev = 0;

        while (num > 0) {
            // Overflow check before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            }

            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        return x < 0 ? -rev : rev;
    }
}
