package com.company.MockInterviews.AmazonMockInterviews.Mock12232019;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

// https://leetcode.com/problems/subtree-of-another-tree/submissions/
public class Problem2 {

    private boolean result = false;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        traverse(s, t);
        return result;
    }

    private void traverse(TreeNode node, TreeNode target) {
        if (node.left != null) traverse(node.left, target);
        if (node.val == target.val) {
            if (isSameTree(node, target)) {
                result = true;
            }
        }
        if (node.right != null) traverse(node.right, target);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
