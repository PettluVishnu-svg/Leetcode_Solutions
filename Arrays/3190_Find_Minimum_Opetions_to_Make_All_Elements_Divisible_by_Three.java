/*
 * Problem: Minimum Operations to Make Elements Divisible by 3
 *
 * Description:
 * Given an integer array `nums`, count the minimum number of operations
 * needed to make each element divisible by 3. 
 * One operation is either adding or subtracting 1 from an element.
 *
 * Approach:
 * - Iterate through each element
 * - If (num + 1) % 3 == 0 or (num - 1) % 3 == 0, increment the operation count
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int minimumOperations(int[] nums) {
        int op = 0;

        for (int num : nums) {
            if ((num + 1) % 3 == 0 || (num - 1) % 3 == 0) {
                op++;
            }
        }

        return op;
    }
}
