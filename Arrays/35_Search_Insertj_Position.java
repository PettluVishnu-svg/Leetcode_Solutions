/*
 * Problem: Search Insert Position
 *
 * Description:
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found. 
 * If not, return the index where it would be if inserted in order.
 *
 * Approach:
 * - Iterate through the array
 * - Stop when the current number is greater than or equal to the target
 * - Return the correct index
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int searchInsert(int[] nums, int target) {
        int i = 0;

        // Handle arrays of length 0 or 1
        if (nums.length <= 1) {
            if (nums.length == 0 || target <= nums[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        // Iterate to find the position
        while (i < nums.length - 1 && target > nums[i]) {
            i++;
        }

        // Check if target is greater than current element
        if (nums[i] < target) {
            return i + 1;
        }

        return i;
    }
}
