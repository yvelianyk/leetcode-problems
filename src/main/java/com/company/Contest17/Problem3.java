package com.company.Contest17;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) return 0;
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        traverse(root, parentMap);
        int result = 0;
        for (Map.Entry<TreeNode, TreeNode> entry : parentMap.entrySet()) {
            TreeNode parent = entry.getValue();
            if (parentMap.containsKey(parent)) {
                TreeNode grandParent = parentMap.get(parent);
                if (grandParent.val % 2 == 0) {
                    result += entry.getKey().val;
                }
            }
        }
        return result;
    }

    private void traverse(TreeNode node, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) return;

        if (node.left != null) {
            parentMap.put(node.left, node);
        }

        if (node.right != null) {
            parentMap.put(node.right, node);
        }

        traverse(node.left, parentMap);
        traverse(node.right, parentMap);
    }
}
