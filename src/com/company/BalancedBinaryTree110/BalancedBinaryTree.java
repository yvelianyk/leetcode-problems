package com.company.BalancedBinaryTree110;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(height(root.left) - height(root.right)) < 2) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
