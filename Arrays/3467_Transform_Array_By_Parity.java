/*
 * Problem: Transform Array by Parity
 *
 * Description:
 * Given an integer array `nums`, transform it into a binary array where:
 * - 0 represents an even number
 * - 1 represents an odd number
 * Then rearrange the array so that all 0s appear before all 1s.
 *
 * Approach:
 * 1. Convert each element to 0 (even) or 1 (odd).
 * 2. Use two pointers to partition the array:
 *    - Move 0s to the left
 *    - Move 1s to the right
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

class Solution {

    public int[] transformArray(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 0);

        // Step 1: Convert numbers to parity (0 = even, 1 = odd)
        int index = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                arr[index] = 1;
            }
            index++;
        }

        // Step 2: Rearrange using two-pointer technique
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return arr;
    }
}
