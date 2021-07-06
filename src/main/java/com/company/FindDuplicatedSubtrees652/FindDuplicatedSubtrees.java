package com.company.FindDuplicatedSubtrees652;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.*;

public class FindDuplicatedSubtrees {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<TreeNode>();
        if (root == null) return result;
        Map<String, Integer> nodesMap = new HashMap<String, Integer>();

        traverse(root, nodesMap, result);

        return result;
    }

    private String traverse(TreeNode node, Map<String, Integer> nodesMap, List<TreeNode> result) {
        if (node == null) return "#";
        String serialized = node.val +
                "," +
                traverse(node.left, nodesMap, result) +
                "," +
                traverse(node.right, nodesMap, result);

        nodesMap.put(serialized, nodesMap.getOrDefault(serialized, 0) + 1);
        if (nodesMap.get(serialized) == 2) {
            result.add(node);
        }
        return serialized;
    }

}
