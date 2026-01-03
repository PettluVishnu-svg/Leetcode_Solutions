/*
 * Problem: Single Number
 *
 * Description:
 * Given a non-empty array of integers, every element appears twice except
 * for one. Find that single element.
 *
 * Approach:
 * - Use XOR operation:
 *   - a ^ a = 0
 *   - a ^ 0 = a
 * - XOR all elements; duplicates cancel out, leaving the unique number
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int singleNumber(int[] nums) {
        int nonRepeat = 0;

        // XOR all numbers
        for (int num : nums) {
            nonRepeat ^= num;
        }

        return nonRepeat;
    }
}
