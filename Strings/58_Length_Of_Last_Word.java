// LeetCode: Length of Last Word
// Topic: Strings
// Approach: Split the string by spaces and find the length of the last word
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int lengthOfLastWord(String s) {

        // Split the string using space as delimiter
        String[] arr = s.split(" ");

        // Get the length of the array
        int arrLength = arr.length;

        // Length of the last word
        int n = arr[arrLength - 1].length();

        return n;
    }
}
