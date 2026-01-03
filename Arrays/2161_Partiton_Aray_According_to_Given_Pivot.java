/*
 * Problem: Pivot Array
 *
 * Description:
 * Given an integer array `nums` and an integer `pivot`, rearrange the array such that:
 * - All elements less than pivot come first
 * - Elements equal to pivot come next
 * - Elements greater than pivot come last
 * Return the rearranged array while maintaining relative order within each group.
 *
 * Approach:
 * - Create a result array of the same length
 * - First pass: add all elements < pivot
 * - Second pass: add all elements == pivot
 * - Third pass: add all elements > pivot
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int index = 0;

        // Elements less than pivot
        for (int num : nums) {
            if (num < pivot) {
                arr[index++] = num;
            }
        }

        // Elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                arr[index++] = num;
            }
        }

        // Elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                arr[index++] = num;
            }
        }

        return arr;
    }
}
