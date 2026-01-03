/*
 * Problem: Merge Two Sorted Linked Lists
 *
 * Description:
 * Given two sorted singly linked lists `list1` and `list2`,
 * merge them into a single sorted linked list.
 * The merged list should be made by reusing the nodes of the input lists.
 *
 * Approach:
 * 1. Use a dummy node to simplify pointer handling.
 * 2. Compare nodes from both lists and attach the smaller one.
 * 3. Append the remaining nodes once one list is exhausted.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 * where n and m are the lengths of the two lists.
 */

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify merge logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge while both lists have nodes
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
