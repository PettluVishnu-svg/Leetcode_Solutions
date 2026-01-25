// LeetCode: 560. Subarray Sum Equals K
// Topic: Arrays / Prefix Sum
// Approach: Brute force using nested loops
// Idea: For each starting index, calculate the sum of all subarrays ending at later indices
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        // Iterate over all possible starting indices
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            // Calculate subarray sums starting from index i
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                // Check if current subarray sum equals k
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
