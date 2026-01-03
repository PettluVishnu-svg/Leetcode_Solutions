/*
 * Problem: Binary Tree Inorder Traversal
 *
 * Description:
 * Given the root of a binary tree, return the inorder traversal
 * of its nodes' values.
 *
 * Inorder Traversal Order:
 * Left → Root → Right
 *
 * Approach:
 * 1. Use recursion to traverse the tree.
 * 2. Visit left subtree, then root, then right subtree.
 * 3. Store node values in a list.
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

    // Helper method for recursive inorder traversal
    private void inOrder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        inOrder(node.left, result);
        result.add(node.val);
        inOrder(node.right, result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }
}
