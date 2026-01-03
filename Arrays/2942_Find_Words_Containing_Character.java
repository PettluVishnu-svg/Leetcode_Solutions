import java.util.ArrayList;
import java.util.List;

/*
 * Problem: Find Words Containing Character
 *
 * Description:
 * Given an array of strings `words` and a character `x`, return a list of indices
 * of all words that contain the character `x`.
 *
 * Approach:
 * - Iterate through the array of words
 * - Use String.indexOf(x) to check if the word contains the character
 * - If yes, add the index to the result list
 *
 * Time Complexity: O(n * m)  // n = number of words, m = average length of word
 * Space Complexity: O(k)    // k = number of words containing the character
 */

class Solution {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }

        return list;
    }
}
