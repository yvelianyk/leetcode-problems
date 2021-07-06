package com.company.Challenges;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class AddOneRowToTree {
    int target;
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        target = d;
        if (d == 1) {
            TreeNode res = new TreeNode(v);
            res.left = root;
            return res;
        }
        return traverse(root, v, 1);
    }
    private TreeNode traverse(TreeNode root, int v, int d) {
        if (root == null) return null;
        if (d == target - 1) {
            TreeNode prevLeft = root.left;
            TreeNode prevRight = root.right;
            root.left = new TreeNode(v);
            root.right = new TreeNode(v);
            root.left.left = prevLeft;
            root.right.right = prevRight;
        }

        root.right = traverse(root.right, v, d + 1);
        root.left = traverse(root.left, v, d + 1);
        return root;
    }
}
