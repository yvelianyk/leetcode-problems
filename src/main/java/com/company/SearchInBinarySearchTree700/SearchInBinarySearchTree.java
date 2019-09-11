package com.company.SearchInBinarySearchTree700;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class SearchInBinarySearchTree {

    // ITERATIVE:
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        TreeNode curr = root;
        while (curr != null) {
            if(curr.val == val) return curr;
            if(val < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        return curr;
    }

//    // RECURSIVE:
//    public TreeNode searchBST(TreeNode root, int val) {
//        if(root == null) return null;
//        if (root.val == val) return root;
//        if (val < root.val) {
//            return searchBST(root.left, val);
//        } else {
//            return searchBST(root.right, val);
//        }
//    }
}
