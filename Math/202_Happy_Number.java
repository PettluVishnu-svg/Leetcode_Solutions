/*
 * Problem: Happy Number
 *
 * Description:
 * A number is called happy if we repeatedly replace it with the sum of the
 * squares of its digits until:
 * - it becomes 1 (happy number), or
 * - it enters a cycle that does not include 1 (not a happy number).
 *
 * Approach:
 * 1. Repeatedly compute the sum of squares of digits.
 * 2. Use the observation that all unhappy numbers eventually reach 4.
 * 3. Stop when the number becomes 1 or 4.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
