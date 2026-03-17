// LeetCode: 3760. Maximum Number of Distinct Characters
// Topic: Strings / Hashing
// Approach: HashSet
// Idea: Store all unique characters using a set and return its size
// Time Complexity: O(n)
// Space Complexity: O(1) (at most 26/128 characters depending on charset)

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxDistinct(String s) {

        Set<Character> set = new HashSet<>();

        // Add all characters to set
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        // Size of set = number of distinct characters
        return set.size();
    }
}