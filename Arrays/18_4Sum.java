// LeetCode: 18. 4Sum
// Topic: Arrays / Two Pointers / Sorting
// Approach: Sort + Two nested loops + Two Pointers
// Idea: Fix two numbers and use two pointers to find remaining pair that sums to target
// Time Complexity: O(n^3)
// Space Complexity: O(1) (excluding result list)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Fix first two elements
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                // Step 3: Two-pointer search
                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for left and right
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;   // Need larger sum
                    } else {
                        right--;  // Need smaller sum
                    }
                }
            }
        }

        return result;
    }
}