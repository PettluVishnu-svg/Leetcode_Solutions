/*
 * Problem: Binary Tree Postorder Traversal
 *
 * Description:
 * Given the root of a binary tree, return the postorder traversal
 * of its nodes' values.
 *
 * Postorder Traversal Order:
 * Left → Right → Root
 *
 * Approach:
 * 1. Use recursion to traverse the tree.
 * 2. Visit left subtree, then right subtree.
 * 3. Process the root node at the end.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * where n is the number of nodes in the tree.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    // Helper method for recursive postorder traversal
    private void postOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        postOrder(node.left, result);   // Left
        postOrder(node.right, result);  // Right
        result.add(node.val);           // Root
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }
}
