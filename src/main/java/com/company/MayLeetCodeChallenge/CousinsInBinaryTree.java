package com.company.MayLeetCodeChallenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CousinsInBinaryTree {
    Map<Integer, Integer> parentMap;
    Map<Integer, Integer> depthMap;
    public boolean isCousins(TreeNode root, int x, int y) {
        parentMap = new HashMap<>();
        depthMap = new HashMap<>();
        traverse(root);
        int xParent = parentMap.getOrDefault(x, 0);
        int yParent = parentMap.getOrDefault(y, 0);
        int xDepth = depthMap.get(x);
        int yDepth = depthMap.get(y);

        return xParent != yParent && xDepth == yDepth;
    }

    private void traverse(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                depthMap.put(current.val, level);
                if (current.left != null) {
                    parentMap.put(current.left.val, current.val);
                    queue.add(current.left);
                }
                if (current.right != null) {
                    parentMap.put(current.right.val, current.val);
                    queue.add(current.right);
                }
            }
            level++;
        }
    }
}
