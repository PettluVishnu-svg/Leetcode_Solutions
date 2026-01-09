// LeetCode: 128. Longest Consecutive Sequence
// Topic: Arrays
// Approach: Sorting
// Idea: Sort the array and count consecutive increasing elements
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {

        // Edge case: empty array
        if (nums.length == 0) {
            return 0;
        }

        // Copy input array to avoid modifying original data
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }

        // Sort the array
        Arrays.sort(array);

        int count = 1;
        int max = 1;

        // Traverse sorted array to find longest consecutive sequence
        for (int i = 0; i < array.length - 1; i++) {

            // Skip duplicate elements
            if (array[i] == array[i + 1]) {
                continue;
            }

            // Check for consecutive numbers
            if (array[i] + 1 == array[i + 1]) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }

        // Final update of maximum length
        max = Math.max(max, count);

        return max;
    }
}
