// LeetCode: 118. Pascal's Triangle
// Topic: Arrays / Math / Combinatorics
// Approach: nCr (Combination formula)
// Idea: Each value at position (i, j) is given by C(i-1, j-1)
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.ArrayList;
import java.util.List;

class Solution {

    // Helper method to calculate nCr using iterative approach
    //nCr(i-1,j-1) value gives value at i,j position in a pascal's triangle
    static int ncr(int n, int r) {

        int ans = 1;

        for (int i = 0; i < r; i++) {
            ans = ans * (n - i);
            ans = ans / (i + 1);
        }

        return ans;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        // Generate each row of Pascal's Triangle
        for (int i = 1; i <= numRows; i++) {

            List<Integer> temp = new ArrayList<>();

            for (int j = 1; j <= i; j++) {
                temp.add(ncr(i - 1, j - 1));
            }

            ans.add(temp);
        }

        return ans;
    }
}
