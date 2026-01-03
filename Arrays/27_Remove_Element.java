/*
 * Problem: Remove Element
 *
 * Description:
 * Given an array of integers and a value `val`, remove all occurrences
 * of `val` in-place and return the new length of the array.
 *
 * Approach:
 * - Use a two-pointer technique
 * - One pointer iterates through the array
 * - Another pointer keeps track of the position to place non-val elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
