// LeetCode: 2807. Insert Greatest Common Divisors in Linked List
// Topic: Linked List / Math
// Approach: Traversal + GCD (Euclidean Algorithm)
// Idea: For each adjacent pair, compute GCD and insert a new node in between
// Time Complexity: O(n * log(min(a, b)))
// Space Complexity: O(1)

class Solution {

    // Helper function to compute GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp = head;

        // Traverse the list
        while (temp != null && temp.next != null) {

            int a = temp.val;
            int b = temp.next.val;

            // Compute GCD
            int g = gcd(a, b);

            // Insert new node
            ListNode newNode = new ListNode(g);
            newNode.next = temp.next;
            temp.next = newNode;

            // Move to next original node
            temp = newNode.next;
        }

        return head;
    }
}