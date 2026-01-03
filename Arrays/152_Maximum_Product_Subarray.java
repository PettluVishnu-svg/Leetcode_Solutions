/*
 * Problem: Maximum Product Subarray
 *
 * Description:
 * Given an integer array `nums`, find the contiguous subarray
 * within the array which has the largest product.
 *
 * Approach:
 * - Use a forward and backward pass to handle negative numbers
 * - Track current product `pro` and update `maxPro`
 * - Reset product to 1 when encountering 0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int maxProduct(int[] nums) {
        int pro = 1;
        int maxPro = Integer.MIN_VALUE;

        // Forward pass
        for (int i = 0; i < nums.length; i++) {
            pro *= nums[i];
            maxPro = Math.max(pro, maxPro);
            if (pro == 0) pro = 1;
        }

        // Backward pass
        pro = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            pro *= nums[i];
            maxPro = Math.max(pro, maxPro);
            if (pro == 0) pro = 1;
        }

        return maxPro;
    }
}
