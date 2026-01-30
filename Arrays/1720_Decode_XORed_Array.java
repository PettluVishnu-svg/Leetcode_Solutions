// LeetCode: 1720. Decode XORed Array
// Topic: Arrays / Bit Manipulation
// Approach: XOR property
// Idea: Use the fact that a ^ b = c  ⇒  b = a ^ c
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] decode(int[] encoded, int first) {

        int[] decoded = new int[encoded.length + 1];

        // The first element is given
        decoded[0] = first;

        // Decode remaining elements using XOR
        for (int i = 1; i <= encoded.length; i++) {
            decoded[i] = decoded[i - 1] ^ encoded[i - 1];
        }

        return decoded;
    }
}
