package com.company.ThirtyDayChellenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class DiameterOfBinaryTree {
    private int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        traverse(root);
        return max;
    }

    private int traverse(TreeNode node) {
        int left = node.left == null ? 0 : 1 + traverse(node.left);
        int right = node.right == null ? 0 : 1 + traverse(node.right);
        max = Math.max(max, left + right);
        return Math.max(left, right);
    }
}
