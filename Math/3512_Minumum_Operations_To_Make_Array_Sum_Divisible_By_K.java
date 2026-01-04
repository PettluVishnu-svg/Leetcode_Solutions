/*
 * Problem: Minimum Operations to Make Sum Divisible by K
 *
 * Description:
 * Given an integer array `nums` and an integer `k`,
 * return the minimum number of operations required
 * to make the sum of the array divisible by `k`.
 *
 * Observation:
 * The minimum number of operations needed is equal to
 * the remainder of the sum when divided by `k`.
 *
 * Approach:
 * 1. Calculate the total sum of the array.
 * 2. Return sum % k.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int minOperations(int[] nums, int k) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum % k;
    }
}
