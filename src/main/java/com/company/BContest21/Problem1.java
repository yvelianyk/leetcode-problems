package com.company.BContest21;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    int max = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;
        traverse(root, 0, 0);
        return max;
    }

    private void traverse(TreeNode node, int resultLeft, int resultRight) {
        if (node == null) return;
        max = Math.max(max, resultLeft);
        max = Math.max(max, resultRight);
        traverse(node.left, 0, resultLeft + 1);
        traverse(node.right, resultRight + 1, 0);
    }
}
