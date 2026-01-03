/*
 * Problem: Sum of All Subset XOR Totals
 *
 * Description:
 * Given an integer array `nums`, find the sum of XOR of all possible subsets.
 *
 * Approach:
 * - Observation: Each bit contributes to half of all subsets
 * - Calculate XOR of all elements and multiply by 2^(n-1), where n = nums.length
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int subsetXORSum(int[] nums) {
        int xor = 0;

        // XOR of all elements
        for (int num : nums) {
            xor |= num; // OR can be used here as optimization for subset XOR sum
        }

        // Multiply by 2^(n-1) for all subsets
        return xor * (1 << (nums.length - 1));
    }
}
