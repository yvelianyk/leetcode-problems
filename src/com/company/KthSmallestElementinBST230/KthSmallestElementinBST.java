package com.company.KthSmallestElementinBST230;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class KthSmallestElementinBST {
    private int counter = 0;
    private int result;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    private void traverse(TreeNode node, int k) {
        if (node == null) return;

        traverse(node.left, k);

        counter++;
        if (counter == k) {
            result = node.val;
        }

        traverse(node.right, k);
    }
}
