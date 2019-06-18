package com.company.TrimBinarySearchTree669;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class TrimBinarySearchTree {

    private TreeNode result;

    public TreeNode trimBST(TreeNode root, int L, int R) {
        traverse(root, L, R);
        return result;
    }

    private void traverse(TreeNode root, int L, int R) {
        if (root == null) return;
        if (root.val <= R && root.val >= L) {
            insert(result, root.val);
        }
        traverse(root.left, L, R);
        traverse(root.right, L, R);
    }

    private void insert(TreeNode root, int val) {
        if (root == null) {
            result = new TreeNode(val);
            return;
        }
        if(root.left == null && root.val > val) {
            root.left = new TreeNode(val);
            return;
        }

        if (root.right == null && root.val < val) {
            root.right = new TreeNode(val);
            return;
        }

        if (val < root.val) {
            insert(root.left, val);
        }

        if (val > root.val) {
            insert(root.right, val);
        }
    }

    // ACADEMIC:
//    public TreeNode trimBST(TreeNode root, int L, int R) {
//        if (root == null) return root;
//        if (root.val > R) return trimBST(root.left, L, R);
//        if (root.val < L) return trimBST(root.right, L, R);
//
//        root.left = trimBST(root.left, L, R);
//        root.right = trimBST(root.right, L, R);
//        return root;
//    }
}
