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
            if (result == null) {
                result = new TreeNode(root.val);
            }
            if (root.val != result.val) {
                insert(result, root.val);
            }
        }
        traverse(root.left, L, R);
        traverse(root.right, L, R);
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val > val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);
        return root;
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
