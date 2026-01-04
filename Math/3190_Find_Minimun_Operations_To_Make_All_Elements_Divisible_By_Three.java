/*
 * Problem: Minimum Operations to Make Array Divisible by 3
 *
 * Description:
 * Given an integer array `nums`, in one operation you can either
 * increment or decrement an element by 1.
 * Return the minimum number of operations required to make
 * every element divisible by 3.
 *
 * Approach:
 * 1. For each number, check if adding or subtracting 1 makes it divisible by 3.
 * 2. If so, count one operation.
 * 3. Numbers already divisible by 3 need no operation.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int minimumOperations(int[] nums) {
        int operations = 0;

        for (int num : nums) {
            if ((num + 1) % 3 == 0 || (num - 1) % 3 == 0) {
                operations++;
            }
        }
        return operations;
    }
}
