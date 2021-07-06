package com.company.ValidateBinarySearchTree98;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class ValidateBSTRecursion {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer lower, Integer higher) {
        if (node == null) return true;

        if (higher != null && node.val >= higher) return false;
        if (lower != null && node.val <= lower) return false;

        return isValid(node.left, lower, node.val) && isValid(node.right, node.val, higher);
    }
}
