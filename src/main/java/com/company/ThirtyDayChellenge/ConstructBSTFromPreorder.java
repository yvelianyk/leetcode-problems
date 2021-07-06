package com.company.ThirtyDayChellenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class ConstructBSTFromPreorder {
    private int index;

    public TreeNode bstFromPreorder(int[] preorder) {
        index = 0;
        return construct(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode construct(int[] preorder, int lower, int higher) {
        if (index == preorder.length) return null;

        int value = preorder[index];
        if (value < lower || value > higher) return null;

        index++;
        TreeNode node = new TreeNode(value);
        node.left = construct(preorder, lower, value);
        node.right = construct(preorder, value, higher);
        return node;
    }
}
