import java.util.Arrays;

/*
 * Problem: Minimum Operations to Move Balls to Each Box
 *
 * Description:
 * You have `n` boxes, each containing 0 or 1 balls represented by a string `boxes`.
 * For each box, calculate the minimum number of operations needed to move all balls to that box.
 * An operation consists of moving one ball from one box to an adjacent box.
 *
 * Approach:
 * - Initialize an answer array of the same length as boxes
 * - For each box `i`, loop through all boxes `j`
 * - If box `j` contains a ball ('1'), add the distance |i - j| to answer[i]
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */

class Solution {

    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        Arrays.fill(answer, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    answer[i] += Math.abs(i - j);
                }
            }
        }

        return answer;
    }
}
