/*
 * Problem: Valid Perfect Square
 *
 * Description:
 * Given a positive integer `num`, return true if `num` is a perfect square.
 * Do not use any built-in library function such as sqrt.
 *
 * Approach:
 * Use Binary Search to find an integer whose square equals `num`.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
