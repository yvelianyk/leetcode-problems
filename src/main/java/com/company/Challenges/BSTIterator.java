package com.company.Challenges;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
    private final List<Integer> arr;
    private int current;
    public BSTIterator(TreeNode root) {
        current = 0;
        this.arr = new ArrayList<>();
        traverse(root);
    }

    public int next() {
        return this.arr.get(current++);
    }

    public boolean hasNext() {
        return current < this.arr.size();
    }

    private void traverse(TreeNode node) {
        if (node == null) return;
        traverse(node.left);
        this.arr.add(node.val);
        traverse(node.right);
    }
}
