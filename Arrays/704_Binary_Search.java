/*
 * Problem: Binary Search
 *
 * Description:
 * Given a sorted array `nums` and a target value, 
 * return the index of the target if it exists, otherwise return -1.
 *
 * Approach:
 * - Use two pointers: `low` and `high`
 * - Calculate middle index `mid`
 * - If nums[mid] equals target, return mid
 * - If target < nums[mid], search left half
 * - If target > nums[mid], search right half
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // safer to avoid overflow

            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // target not found
    }
}
