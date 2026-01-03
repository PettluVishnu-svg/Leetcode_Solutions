/*
 * Problem: Check if Array Is Sorted and Rotated
 *
 * Description:
 * Given an integer array `nums`, return true if the array is sorted in
 * non-decreasing order and then rotated some number of times.
 *
 * Approach:
 * 1. Count the number of places where the order decreases
 *    (nums[i] > nums[i+1]).
 * 2. Use modulo to compare the last and first elements.
 * 3. If such a decrease occurs more than once, the array is not valid.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean check(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
