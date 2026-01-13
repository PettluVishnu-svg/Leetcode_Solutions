// LeetCode: Count Pairs Whose Sum Is Less Than Target
// Topic: Arrays / Two Pointers / Brute Force
// Approach: Nested loops
// Idea: Check all unique pairs and count those whose sum is less than the target
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {

        int count = 0;

        // Iterate over all unique pairs
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {

                // Check if the pair sum is less than target
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
