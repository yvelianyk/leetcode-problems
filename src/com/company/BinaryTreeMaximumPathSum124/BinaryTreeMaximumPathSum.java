package com.company.BinaryTreeMaximumPathSum124;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class BinaryTreeMaximumPathSum {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMax(root);
        return max;
    }

    private int getMax(TreeNode node) {
        if(node == null) return 0;
        int maxLeft = Math.max(getMax(node.left), 0);
        int maxRight = Math.max(getMax(node.right), 0);
        max = Math.max(max, node.val + maxLeft + maxRight);
        return node.val + Math.max(maxLeft, maxRight);
    }
}
