/*
 * Problem: Minimum Operations to Make Array Sum Divisible by K
 *
 * Description:
 * Given an integer array `nums` and an integer `k`, return the minimum number
 * of operations required to make the sum of the array divisible by `k`.
 * In one operation, you can remove exactly one element from the array.
 *
 * Observation:
 * Removing elements changes the total sum. The minimum number of removals
 * needed is equal to (sum % k).
 *
 * Approach:
 * 1. Compute the total sum of the array.
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
