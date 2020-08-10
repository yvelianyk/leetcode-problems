package com.company.AugustLeetcodeChallenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

// TODO: could be solved in O(n) time by using some kind of the prefix sums
public class PathSumIII {
    private int result = 0;
    private int sum;

    public int pathSum(TreeNode root, int sum) {
        this.sum = sum;
        traverse(root);
        return result;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        count(node, 0);
        traverse(node.left);
        traverse(node.right);
    }

    private void count(TreeNode root, int prev) {
        if (root == null) return;
        int value = root.val + prev;
        if (value == sum) result++;
        count(root.left, value);
        count(root.right, value);
    }
}
