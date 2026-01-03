// LeetCode: Find Words Containing Character
// Topic: Arrays
// Approach: Linear scan with string search
// Idea: Check each word and record its index if the character exists
// Time Complexity: O(n * m), where m is the average word length
// Space Complexity: O(k), where k is the number of matching indices

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check if the character exists in the word
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }

        return list;
    }
}
