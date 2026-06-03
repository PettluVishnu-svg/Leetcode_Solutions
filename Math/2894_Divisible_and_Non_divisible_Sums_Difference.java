// LeetCode: 2894. Divisible and Non-divisible Sums Difference
// Topic: Math / Simulation
// Approach: Iterative Traversal
// Idea:
// Traverse numbers from 1 to n.
// Add numbers divisible by m to num2.
// Add remaining numbers to num1.
// Return num1 - num2.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int differenceOfSums(int n, int m) {

        int num1 = 0, num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0)
                num2 += i;
            else
                num1 += i;
        }

        return num1 - num2;
    }
}
