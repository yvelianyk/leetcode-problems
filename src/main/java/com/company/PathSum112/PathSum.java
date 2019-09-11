package com.company.PathSum112;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class PathSum {
    private boolean result = false;
    private int _sum = 0;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        _sum = sum;
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode node, int sum) {
        if (result) return;
        if(node.left != null) traverse(node.left, sum + node.val);
        if(node.right != null) traverse(node.right, sum + node.val);
        if(node.left == null && node.right == null && sum + node.val == _sum) {
            result = true;
        }
    }
}
