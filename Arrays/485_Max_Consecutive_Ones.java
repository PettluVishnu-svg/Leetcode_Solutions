/*
 * Problem: Max Consecutive Ones
 *
 * Description:
 * Given a binary array `nums`, return the maximum number of consecutive 1's in the array.
 *
 * Approach:
 * - Use a counter `count` to track current consecutive ones
 * - Update `maxCount` whenever count increases
 * - Reset `count` to 0 when a 0 is encountered
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}
