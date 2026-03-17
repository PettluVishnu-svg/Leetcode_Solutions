// LeetCode: 34. Find First and Last Position of Element in Sorted Array
// Topic: Binary Search / Arrays
// Approach: Binary Search + Linear Expansion
// Idea: Find one occurrence using binary search, then expand left and right
// Time Complexity: O(log n + k)  (k = occurrences of target)
// Space Complexity: O(1)

import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];
        Arrays.fill(arr, -1);

        int low = 0;
        int high = nums.length - 1;

        // Binary search to find one occurrence
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                // Expand to the left
                int index1 = mid;
                while (index1 >= 0 && nums[index1] == target) {
                    arr[0] = index1;
                    index1--;
                }

                // Expand to the right
                int index2 = mid;
                while (index2 < nums.length && nums[index2] == target) {
                    arr[1] = index2;
                    index2++;
                }

                return arr;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return arr;
    }
}