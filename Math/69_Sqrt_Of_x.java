/*
 * Problem: Sqrt(x)
 *
 * Description:
 * Given a non-negative integer `x`, compute and return the square root of `x`.
 * Since the return type is an integer, only the integer part of the result
 * should be returned (floor value).
 *
 * Approach:
 * Use Binary Search to find the largest integer whose square
 * is less than or equal to `x`.
 *
 * Time Complexity: O(log x)
 * Space Complexity: O(1)
 */

class Solution {

    public int mySqrt(int x) {
        if (x == 0) return 0;

        long left = 1, right = x;
        int ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                ans = (int) mid;   // possible answer
                left = mid + 1;    // try to find a larger value
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
