package com.company.BContest26;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class Problem3 {
    int count;
    public int goodNodes(TreeNode root) {
        count = 0;
        traverse(root, Integer.MIN_VALUE);
        return count;
    }

    private void traverse(TreeNode node, int max) {
        if (node.val >= max) count++;
        max = Math.max(max, node.val);

        if (node.left != null) traverse(node.left, max);
        if (node.right != null) traverse(node.right, max);
    }
}
