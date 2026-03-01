// LeetCode: 56. Merge Intervals
// Topic: Arrays / Sorting / Greedy
// Approach: Sort + Merge Overlapping Intervals
// Idea: Sort intervals by start time, then merge overlapping ones
// Time Complexity: O(n log n)
// Space Complexity: O(n) (for result list)

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        // Step 2: Traverse all intervals
        for (int i = 0; i < intervals.length; i++) {

            // If result is empty OR no overlap
            if (result.isEmpty() || intervals[i][0] > result.get(result.size() - 1)[1]) {

                // Add new interval
                result.add(new int[]{intervals[i][0], intervals[i][1]});

            } else {
                // Merge with last interval
                result.get(result.size() - 1)[1] =
                        Math.max(result.get(result.size() - 1)[1], intervals[i][1]);
            }
        }

        // Step 3: Convert ArrayList to 2D array
        int[][] ans = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}