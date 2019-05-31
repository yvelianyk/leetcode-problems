package com.company.BinarySearchTreeIterator173;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BSTIterator {
    private Queue<Integer> treeQueue = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        traverse(root);
    }

    /** @return the next smallest number */
    public int next() {
        return treeQueue.poll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return treeQueue.size() != 0;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.left);
        treeQueue.add(node.val);
        traverse(node.right);
    }
}
