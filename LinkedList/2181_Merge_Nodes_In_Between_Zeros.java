// LeetCode: 2181. Merge Nodes in Between Zeros
// Topic: Linked List
// Approach: Traversal + Summation
// Idea: Traverse between zeros, compute sum of nodes, and build a new list
// Time Complexity: O(n)
// Space Complexity: O(n) (for storing sums)

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        // Traverse and calculate sums between zeros
        while (temp != null) {

            if (temp.val == 0) {

                int sum = 0;
                ListNode cur = temp.next;

                while (cur != null && cur.val != 0) {
                    sum += cur.val;
                    cur = cur.next;
                }

                list.add(sum);
                temp = cur;
            }
        }

        // Build new linked list from sums
        ListNode newHead = new ListNode(list.get(0));
        ListNode tempNode = newHead;

        int index = 1;
        while (index < list.size()) {

            ListNode node = new ListNode(list.get(index));
            tempNode.next = node;
            tempNode = node;
            index++;
        }

        return newHead;
    }
}