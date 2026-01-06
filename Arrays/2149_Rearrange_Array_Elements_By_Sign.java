// LeetCode: 2149. Rearrange Array Elements by Sign
// Topic: Arrays
// Approach: Two-pointer placement
// Idea: Place positive numbers at even indices and negative numbers at odd indices
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] array = new int[nums.length];

        // i for positive numbers (even indices), j for negative numbers (odd indices)
        int i = 0, j = 1;
        int index = 0;

        // Traverse through the input array
        while (index < nums.length) {

            if (nums[index] > 0) {
                array[i] = nums[index++];
                i += 2;
            } else {
                array[j] = nums[index++];
                j += 2;
            }
        }

        return array;
    }
}
