// LeetCode: 3701. Compute Alternating Sum
// Topic: Arrays
// Approach: Index-based accumulation
// Idea: Add values at even indices and subtract values at odd indices
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int alternatingSum(int[] nums) {

        int even = 0, odd = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Add to even sum if index is even, else add to odd sum
            if (i % 2 == 0) {
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }

        // Return alternating sum
        return even - odd;
    }
}
