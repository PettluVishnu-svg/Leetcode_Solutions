/*
 * Problem: Shuffle the Array
 *
 * Description:
 * Given an array `nums` of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn],
 * return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * Approach:
 * - Use two pointers `even` and `odd` to fill the result array
 * - `even` starts at index 0, `odd` starts at index 1
 * - Place first n elements at even indices, last n elements at odd indices
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int even = 0; // index for first half
        int odd = 1;  // index for second half

        for (int i = 0; i < n; i++) {
            result[even] = nums[i];       // x_i
            result[odd] = nums[i + n];    // y_i
            even += 2;
            odd += 2;
        }

        return result;
    }
}
