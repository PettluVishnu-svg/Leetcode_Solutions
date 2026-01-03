// LeetCode: 2011. Final Value of Variable After Performing Operations
// Topic: Arrays
// Approach: String inspection
// Idea: The operation type can be identified by checking the middle character
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int size = operations.length;
        int val = 0;

        // Iterate through all operations
        for (int i = 0; i < size; i++) {

            String word = operations[i];

            // '+' indicates increment, '-' indicates decrement
            if (word.charAt(1) == '+') {
                val += 1;
            } else if (word.charAt(1) == '-') {
                val -= 1;
            }
        }

        return val;
    }
}
