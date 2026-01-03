/*
 * Problem: Concatenation of Array
 *
 * Description:
 * Given an integer array `nums` of length n, return an array of length 2n
 * where the result is the concatenation of `nums` with itself.
 *
 * Approach:
 * - Create a result array of size 2 * n
 * - Copy each element to its original index and its offset index (i + n)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];       // first half
            result[i + n] = nums[i];   // second half
        }

        return result;
    }
}
