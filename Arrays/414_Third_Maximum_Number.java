// LeetCode: 414. Third Maximum Number
// Topic: Arrays
// Approach: Maintain three maximum values
// Idea: Track first, second, and third distinct maximum numbers while iterating
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int thirdMax(int[] nums) {

        long v1 = nums[0];
        long v2 = Long.MIN_VALUE;
        long v3 = Long.MIN_VALUE;

        // Traverse the array to find top three distinct maximum values
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > v1 && nums[i] > v2 && nums[i] > v3) {
                v3 = v2;
                v2 = v1;
                v1 = nums[i];

            } else if (nums[i] > v2 && nums[i] > v3 && nums[i] < v1) {
                v3 = v2;
                v2 = nums[i];

            } else if (nums[i] > v3 && nums[i] < v2 && nums[i] < v1) {
                v3 = nums[i];
            }
        }

        // If third maximum does not exist, return the maximum element
        if (v3 == Long.MIN_VALUE) {
            long max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            return (int) max;
        }

        return (int) v3;
    }
}