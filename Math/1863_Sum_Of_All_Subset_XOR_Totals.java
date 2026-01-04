/*
 * Problem: Subset XOR Sum
 *
 * Description:
 * Given an integer array `nums`, return the sum of XOR totals of all subsets.
 * The XOR total of a subset is defined as the bitwise XOR of all its elements.
 *
 * Key Observation:
 * Each bit that appears in any element contributes to exactly
 * 2^(n-1) subsets.
 *
 * Approach:
 * 1. Compute the bitwise OR of all elements.
 * 2. Multiply the result by 2^(n-1) to get the total XOR sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int subsetXORSum(int[] nums) {
        int bitwiseOr = 0;

        for (int num : nums) {
            bitwiseOr |= num;
        }

        return bitwiseOr * (1 << (nums.length - 1));
    }
}
