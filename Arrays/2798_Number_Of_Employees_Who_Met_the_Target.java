// LeetCode: 2798. Number of Employees Who Met the Target
// Topic: Arrays
// Approach: Linear traversal
// Idea: Count employees whose working hours are greater than or equal to the target
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;

        // Traverse through each employee's working hours
        for (int item : hours) {

            // Check if the target is met
            if (item >= target) {
                count++;
            }
        }

        return count;
    }
}
