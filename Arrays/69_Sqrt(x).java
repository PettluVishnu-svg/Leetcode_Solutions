// LeetCode: 69. Sqrt(x)
// Topic: Binary Search / Math
// Approach: Binary Search
// Idea: Search the square root in the range [1, x/2] and keep track of the floor value
// Time Complexity: O(log x)
// Space Complexity: O(1)

import java.lang.*;

class Solution {
    public int mySqrt(int x) {

        // Edge case
        if (x < 2) return x;

        long left = 1;
        long right = x / 2;
        int ans = 0;

        // Binary Search
        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return (int) mid;
            }

            else if (mid * mid < x) {
                ans = (int) mid;   // Store possible answer
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}