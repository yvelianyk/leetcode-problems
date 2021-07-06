package com.company.ValidateBinarySearchTree98;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, list);
        if (list.size() == 1) return true;

        for (int i = 1; i < list.size(); i++) {
             int prev = list.get(i - 1);
             int curr = list.get(i);
             if (curr <= prev) return false;

        }
        return true;
    }

    private void traverse(TreeNode root, List list) {
        if (root == null) return;
        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);
    }
}
