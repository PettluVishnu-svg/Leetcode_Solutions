// LeetCode: 1672. Richest Customer Wealth
// Topic: Arrays / 2D Arrays
// Approach: Row-wise sum
// Idea: Calculate the sum of each customer's accounts and return the maximum
// Time Complexity: O(m * n), where m = number of customers, n = number of accounts per customer
// Space Complexity: O(1)

class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;

        // Traverse each customer's account
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            // Sum all accounts for the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // Update max wealth
            max = Math.max(max, sum);
        }

        return max;
    }
}
