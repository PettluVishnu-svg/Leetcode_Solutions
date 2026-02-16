// LeetCode: 229. Majority Element II
// Topic: Arrays
// Approach: Brute Force counting
// Idea: Count frequency of each element and add those appearing more than n/3 times
// Time Complexity: O(n^2)
// Space Complexity: O(1) (excluding result list)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        // Traverse each element
        for (int i = 0; i < nums.length; i++) {

            int count = 1;

            // Count occurrences of nums[i]
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Check if frequency is greater than n/3 and avoid duplicates
            if (count > nums.length / 3 && !list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        return list;
    }
}
