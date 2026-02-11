// LeetCode: 15. 3Sum
// Topic: Arrays / Two Pointers / Sorting
// Approach: Sort + Two Pointers
// Idea: Fix one element and use two pointers to find pairs that sum to zero
// Time Complexity: O(n^2)
// Space Complexity: O(1) (excluding result list)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        // Step 2: Fix one element and apply two-pointer approach
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicates for j and k
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    j++;
                    k--;

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return list;
    }
}
