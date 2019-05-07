package com.company.BinaryTreeInorderTraversal94;

import javax.swing.tree.TreeNode;
import java.util.*;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current.left != null) {
                stack.push(current.left);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
