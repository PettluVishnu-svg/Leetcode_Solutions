// LeetCode: 11. Container With Most Water
// Topic: Arrays / Two Pointers
// Approach: Two Pointer Technique
// Idea:
// Start with pointers at both ends.
// Calculate the area formed by the two lines.
// Move the pointer with the smaller height inward because
// moving the taller line cannot increase the area.
// Track the maximum area found.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {

        if (height.length == 2)
            return Math.min(height[0], height[1]);

        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int waterHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = width * waterHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
