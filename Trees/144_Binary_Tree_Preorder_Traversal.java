/*
 * Problem: Binary Tree Preorder Traversal
 *
 * Description:
 * Given the root of a binary tree, return the preorder traversal
 * of its nodes' values.
 *
 * Preorder Traversal Order:
 * Root → Left → Right
 *
 * Approach:
 * 1. Use recursion to visit nodes.
 * 2. Process the root first.
 * 3. Traverse left subtree followed by right subtree.
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

    // Helper method for recursive preorder traversal
    private void preOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);        // Root
        preOrder(node.left, result); // Left
        preOrder(node.right, result);// Right
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }
}
