/*
 * Problem: Final Value of Variable After Operations
 *
 * Description:
 * You are given an array of strings `operations` containing increment and decrement operations
 * ("++X", "X++", "--X", "X--"). Start with variable `X = 0` and return its final value
 * after performing all operations.
 *
 * Approach:
 * - Iterate through all operations
 * - Check the second character of the string:
 *   - '+' → increment `val`
 *   - '-' → decrement `val`
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int finalValueAfterOperations(String[] operations) {
        int val = 0;

        for (String op : operations) {
            if (op.charAt(1) == '+') {
                val++;
            } else if (op.charAt(1) == '-') {
                val--;
            }
        }

        return val;
    }
}
