/*
 * Problem: Rotate Array
 *
 * Description:
 * Given an array, rotate the array to the right by `k` steps, where k is non-negative.
 *
 * Approach:
 * - Create a temporary array `temp` of the same size
 * - Place each element at its new index `(i + k) % n`
 * - Copy `temp` back into `nums`
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];

        // Place elements at rotated positions
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Copy back to original array
        for (int j = 0; j < n; j++) {
            nums[j] = temp[j];
        }
    }
}
