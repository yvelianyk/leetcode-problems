package com.company.MayLeetCodeChallenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class CousinsInBinaryTree {
    int x;
    int y;

    int xVisited;
    int yVisited;

    int xLevel = -1;
    int yLevel = -1;

    int xParent = -1;
    int yParent = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;

        return traverse(root, null, 0);
    }

    private boolean traverse(TreeNode node, TreeNode parent, int depth) {
        if (node == null) return false;

        if (node.val == x) {
            xVisited = 1;
            xLevel = depth;
            xParent = parent != null ? parent.val: -1;
        }

        if (node.val == y) {
            yVisited = 1;
            yLevel = depth;
            yParent = parent != null ? parent.val: -1;
        }

        if (node.val == x && yVisited == 1 && yLevel == depth && yParent != xParent) {
            return true;
        }

        if (node.val == y && xVisited == 1 && xLevel == depth && yParent != xParent) {
            return true;
        }

        return traverse(node.left, node, depth + 1) || traverse(node.right, node, depth + 1);

    }
}
