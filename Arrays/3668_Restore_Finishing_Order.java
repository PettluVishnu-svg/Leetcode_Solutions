/*
 * Problem: Recover Order from Friends List
 *
 * Description:
 * You are given two integer arrays:
 * - `order`: represents the correct sequence of items
 * - `friends`: represents a subset of items selected by friends
 *
 * Task:
 * Reconstruct the array such that the elements present in `friends`
 * appear in the same relative order as in `order`.
 *
 * Approach:
 * 1. Traverse the `order` array.
 * 2. For each element, check if it exists in `friends`.
 * 3. If found, add it to the result array.
 *
 * Time Complexity: O(n × m)
 * Space Complexity: O(m)
 * where n = order.length and m = friends.length
 */

class Solution {

    public int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int index = 0;

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    result[index++] = order[i];
                }
            }
        }
        return result;
    }
}
