package com.company.InsertintoBinarySearchTree701;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class InsertintoBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode target = findNode(root, val);
        if (val < target.val) {
            target.left = new TreeNode(val);
        } else {
            target.right = new TreeNode(val);
        }

        return root;
    }

    // ITERATIVE:
    private TreeNode findNode(TreeNode root, int val) {
        TreeNode curr = root;
        TreeNode prev = root;
        while (curr != null) {
            if (val < curr.val) {
                prev = curr;
                curr = curr.left;
            } else {
                prev = curr;
                curr = curr.right;
            }
        }
        return prev;
    }

    // RECURSION:
//    private TreeNode findNode(TreeNode root, int val) {
//        if (root == null) return root;
//        TreeNode target;
//        if (val < root.val) {
//            target = findNode(root.left, val);
//        } else {
//            target = findNode(root.right, val);
//        }
//        return target;
//    }
}
