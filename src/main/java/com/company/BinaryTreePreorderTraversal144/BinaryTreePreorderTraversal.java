package com.company.BinaryTreePreorderTraversal144;

import java.util.*;

public class BinaryTreePreorderTraversal {

    // =========================================================
    // ITERATIVE(DFS):
    // =========================================================

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }

        return result;
    }

    // =========================================================
    // RECURSIVE:
    // =========================================================

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if(root == null) return result;
//        traverse(root, result);
//        return result;
//    }
//
//    private void traverse(TreeNode node, List<Integer> result) {
//        result.add(node.val);
//        if(node.left != null) traverse(node.left, result);
//        if(node.right != null) traverse(node.right, result);
//    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

