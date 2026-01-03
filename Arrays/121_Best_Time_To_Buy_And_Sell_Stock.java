import java.util.ArrayList;

/*
 * Problem: Merge Sorted Array
 *
 * Description:
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1
 * as one sorted array. Assume nums1 has enough space at the end to hold nums2.
 *
 * Approach:
 * - Use two pointers to traverse both arrays
 * - Add smaller elements to a temporary ArrayList
 * - Copy the merged elements back into nums1
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)  // Using temporary ArrayList
 */

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int len = m + n;
        ArrayList<Integer> mergedList = new ArrayList<>(len);

        // Edge cases: one array is empty
        if (n == 0) {
            while (i < m) {
                mergedList.add(nums1[i++]);
            }
        } else if (m == 0) {
            while (j < n) {
                mergedList.add(nums2[j++]);
            }
        }

        // Merge the arrays using two pointers
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedList.add(nums1[i++]);
            } else {
                mergedList.add(nums2[j++]);
            }
        }

        // Add remaining elements
        while (i < m) {
            mergedList.add(nums1[i++]);
        }

        while (j < n) {
            mergedList.add(nums2[j++]);
        }

        // Copy back into nums1
        for (int k = 0; k < len; k++) {
            nums1[k] = mergedList.get(k);
        }
    }
}
