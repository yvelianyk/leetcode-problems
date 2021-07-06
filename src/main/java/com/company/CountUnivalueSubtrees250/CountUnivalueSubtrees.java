package com.company.CountUnivalueSubtrees250;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class CountUnivalueSubtrees {

    private int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        isUnivalue(root);
        return count;
    }

    private boolean isUnivalue(TreeNode node) {
        if (node == null) return true;
        if (node.left == null && node.right == null) {
            count++;
            return true;
        }
        boolean isLeftUnivalue = isUnivalue(node.left);
        boolean isRightUnivalue = isUnivalue(node.right);
        boolean isUnival = isLeftUnivalue && isRightUnivalue;
        if (node.left != null) isUnival = isUnival && node.val == node.left.val;
        if (node.right != null) isUnival = isUnival && node.val == node.right.val;
        if (isUnival) count++;
        return isUnival;
    }
}
