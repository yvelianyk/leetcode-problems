package com.company.AugustLeetcodeChallenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, 0);
    }

    // 1 - left, 2 - right
    private int sum(TreeNode node, int indicator) {
        if(node != null && node.left == null && node.right == null && indicator == 1) {
            return node.val;
        }
        if (node == null) return 0;
        return sum(node.left, 1) + sum(node.right, 2);
    }
}
