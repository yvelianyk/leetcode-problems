package com.company.Challenges;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class SubtreeWithAllDeepest {
    Map<TreeNode, Integer> count;
    int maxDepth = -1;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        count = new HashMap<>();
        countDepth(root, -1);
        return getLCA(root);
    }

    private TreeNode getLCA(TreeNode node) {
        if (node == null || count.get(node) == maxDepth) return node;
        TreeNode left = getLCA(node.left);
        TreeNode right = getLCA(node.right);
        if (left != null && right != null) {
            return node;
        }
        if (left != null) return left;
        return right;
    }

    private void countDepth(TreeNode node, int parentDepth) {
        if (node == null) return;
        count.put(node, parentDepth + 1);
        maxDepth = Math.max(maxDepth, parentDepth + 1);
        countDepth(node.left, parentDepth + 1);
        countDepth(node.right, parentDepth + 1);
    }
}
