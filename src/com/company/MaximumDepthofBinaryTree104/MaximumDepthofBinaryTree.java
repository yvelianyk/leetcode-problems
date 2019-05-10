package com.company.MaximumDepthofBinaryTree104;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class MaximumDepthofBinaryTree {
    private int answer = 0;

    // =========================================================
    // TOP-DOWN:
    // =========================================================

//    public int maxDepth(TreeNode root) {
//        if (root == null) return 0;
//        traverse(root, 1);
//        return answer;
//    }
//
//    private void traverse(TreeNode root, int depth) {
//        if (root.left == null && root.right == null) answer = Math.max(answer, depth + 1);
//        if (root.left != null) traverse(root.left, depth + 1);
//        if (root.right != null) traverse(root.right, depth + 1);
//    }

    // =========================================================
    // BOTTOM-UP:
    // =========================================================

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return traverse(root);
    }

    private int traverse(TreeNode root) {
        if (root == null) return 0;
        int left = traverse(root.left);
        int right = traverse(root.right);
        return Math.max(left, right) + 1;
    }

}
