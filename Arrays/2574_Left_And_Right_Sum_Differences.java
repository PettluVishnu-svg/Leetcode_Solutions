// LeetCode: 2574. Left and Right Sum Differences
// Topic: Arrays / Prefix Sum
// Approach: Prefix and Suffix sum arrays
// Idea: For each index, compute absolute difference between left sum and right sum
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] leftRightDifference(int[] nums) {

        int lSum = 0, rSum = 0;

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];

        // Compute prefix sums (left sums)
        for (int i = 1; i < nums.length; i++) {
            lSum += nums[i - 1];
            leftSum[i] = lSum;

            // Compute suffix sums (right sums)
            rSum += nums[nums.length - i];
            rightSum[nums.length - i - 1] = rSum;
        }

        // Calculate absolute differences
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}
