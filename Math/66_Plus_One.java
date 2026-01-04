/*
 * Problem: Plus One
 *
 * Description:
 * You are given a large integer represented as an array of digits.
 * Increment the integer by one and return the resulting array of digits.
 *
 * Approach:
 * 1. Traverse the array from right to left.
 * 2. If a digit is less than 9, increment it and return.
 * 3. If a digit is 9, set it to 0 and continue.
 * 4. If all digits are 9, create a new array with an extra leading 1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (O(n) only when a new array is created)
 */

class Solution {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // Case when all digits are 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
