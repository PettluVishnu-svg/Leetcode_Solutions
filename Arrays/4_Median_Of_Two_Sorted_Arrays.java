/*
 * Problem: Median of Two Sorted Arrays
 *
 * Description:
 * Given two sorted arrays, merge them into a single sorted array
 * and return the median of the combined array.
 *
 * Approach:
 * - Merge both arrays using two pointers
 * - Compute median based on total length
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)
 */

class Solution {

    // Helper method to find median of a sorted array
    static double median(int[] merged) {
        int n = merged.length;

        if (n % 2 != 0) {
            return merged[n / 2];
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge both sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return median(merged);
    }
}
