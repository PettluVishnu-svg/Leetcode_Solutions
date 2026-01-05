/*
 * Problem: Sort Colors (Dutch National Flag Problem)
 *
 * Description:
 * Given an array `nums` containing only 0s, 1s, and 2s,
 * sort the array in-place so that all 0s come first,
 * followed by all 1s, and then all 2s.
 *
 * Approach:
 * Use the Dutch National Flag algorithm with three pointers:
 * - low: boundary for 0s
 * - mid: current element
 * - high: boundary for 2s
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    // Utility method to swap elements
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }
}
