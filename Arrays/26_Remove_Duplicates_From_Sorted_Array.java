/*
 * Problem: Remove Duplicates from Sorted Array
 *
 * Description:
 * Given a sorted array, remove the duplicates in-place such that
 * each element appears only once and return the new length.
 *
 * Approach:
 * - Maintain an index `k` for unique elements
 * - For each element, check if it already exists in the unique range
 * - If not, place it at index `k` and increment `k`
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;

        for (int j = 0; j < n; j++) {
            boolean isDuplicate = false;

            for (int i = 0; i < k; i++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }
}
