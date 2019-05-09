package com.company.BinaryTreeLevelOrderTraversal102;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode current = queue.poll();
                levelList.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(levelList);
        }

        return result;
    }
}
