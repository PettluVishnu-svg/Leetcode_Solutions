// LeetCode: 3925. Concatenation of Array with Reverse Array
// Topic: Arrays
// Approach: Single Pass Construction
// Idea:
// Create a new array of size 2 * n.
// Copy the original array into the first half.
// Simultaneously place the reversed elements into the second half.
// Return the resulting array.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] concatWithReverse(int[] nums) {

        int[] mirror = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            mirror[i] = nums[i];
            mirror[nums.length + i] = nums[nums.length - i - 1];
        }

        return mirror;
    }
}
