package com.company.TwoSumIV653;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIV {
    Set<Integer> nodesSet;
    int target;
    public boolean findTarget(TreeNode root, int k) {
        nodesSet = new HashSet<>();
        target = k;
        return traverse(root);
    }

    private boolean traverse(TreeNode node) {
        if (node == null) return false;
        if (nodesSet.contains(target - node.val)) return true;

        nodesSet.add(node.val);
        return traverse(node.left) || traverse(node.right);
    }
}
