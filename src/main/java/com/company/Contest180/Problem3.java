package com.company.Contest180;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> sorted = new ArrayList<>();
        traverse(root, sorted);
        return buildBalanced(sorted, 0, sorted.size() - 1);
    }

    private TreeNode buildBalanced(List<TreeNode> sorted, int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode midNode = sorted.get(mid);

        midNode.left = buildBalanced(sorted, start, mid - 1);
        midNode.right = buildBalanced(sorted, mid + 1, end);
        return midNode;
    }

    private void traverse(TreeNode node, List<TreeNode> sorted) {
        if(node == null) return;
        traverse(node.left, sorted);
        sorted.add(node);
        traverse(node.right, sorted);
    }
}
