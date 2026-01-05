/*
 * Problem: Majority Element
 *
 * Description:
 * Given an array `nums`, find the element that appears
 * more than ⌊n / 2⌋ times.
 * The majority element always exists.
 *
 * Approach:
 * Use a HashMap to count the frequency of each element.
 * Return the element as soon as its count exceeds n / 2.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1; // fallback (not needed as majority always exists)
    }
}
