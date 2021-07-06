package com.company.Contest172;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class Problem3 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        TreeNode stub = new TreeNode(0);
        stub.left = root;
        traverse(stub, target);
        return stub.left;
    }

    private boolean traverse(TreeNode node, int target) {
        if (node == null) return false;
        if (node.left == null && node.right == null) return true;
        boolean isLeafLeft = traverse(node.left, target);
        if (isLeafLeft && node.left.val == target) {
            node.left = null;
        }
        boolean isLeafRight = traverse(node.right, target);
        if (isLeafRight && node.right.val == target) {
            node.right = null;
        }
        return node.left == null && node.right == null;
    }
}
