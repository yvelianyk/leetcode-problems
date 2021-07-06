package com.company.AugustLeetcodeChallenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class IncreasingOrderSearchTree {
    TreeNode stub;
    TreeNode pointer;

    public TreeNode increasingBST(TreeNode root) {
        stub = new TreeNode(-1);
        pointer = stub;
        traverse(root);
        return stub.right;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.left);
        pointer.right = new TreeNode(node.val);
        pointer = pointer.right;
        traverse(node.right);
    }
}
