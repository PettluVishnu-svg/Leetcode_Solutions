/*
 * Problem: Plus One
 *
 * Description:
 * Given a non-empty array of digits representing a non-negative integer,
 * increment the integer by one and return the resulting array of digits.
 *
 * Approach:
 * - Start from the least significant digit (rightmost)
 * - If digit < 9, increment and return
 * - If digit == 9, set to 0 and continue
 * - If all digits were 9, create a new array with leading 1
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (or O(n) if a new array is created)
 */

class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // carry over
        }

        // If all digits were 9, create new array
        int[] result = new int[n + 1];
        result[0] = 1; // leading 1, rest are 0 by default
        return result;
    }
}
