package com.company.SameTree100;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.Stack;

public class SameTree {

    // RECURSIVE APPROACH:
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (p == null || q == null || p.val != q.val) return false;
//
//        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }

    // ITERATIVE APPROACH:
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> leftStack = new Stack<TreeNode>();
        Stack<TreeNode> rightStack = new Stack<TreeNode>();

        if (!checkNulls(p, q)) return false;
        if (p != null && q != null) {
            leftStack.push(p);
            rightStack.push(q);
        }

        while (!leftStack.isEmpty()) {
            TreeNode currP = leftStack.pop();
            TreeNode currQ = rightStack.pop();
            if (currP.val != currQ.val) return false;
            if (currP.left != null && currQ.left != null) {
                leftStack.push(currP.left);
                rightStack.push(currQ.left);
            }
            if (currP.right != null && currQ.right != null) {
                leftStack.push(currP.right);
                rightStack.push(currQ.right);
            }

            if (!checkNulls(currP.left, currQ.left)) return false;
            if (!checkNulls(currP.right, currQ.right)) return false;
        }
        return true;
    }

    private boolean checkNulls(TreeNode currP, TreeNode currQ) {
        if (currP != null && currQ == null) return false;
        if (currP == null && currQ != null) return false;
        return true;
    }

}
