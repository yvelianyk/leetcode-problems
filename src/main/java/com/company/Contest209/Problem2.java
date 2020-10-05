package com.company.Contest209;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem2 {

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean isOdd = true;
        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int queueSize = queue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode current = queue.poll();
                if (isOdd) {
                    if (current.val % 2 != 1) return false;
                } else {
                    if (current.val % 2 != 0) return false;
                }
                levelList.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            // if (levelList.size() == 1) continue;
            if (isOdd) {
                for (int i = 1; i < levelList.size(); i++) {
                    int prev = levelList.get(i - 1);
                    if (levelList.get(i) <= prev) return false;
                }
            } else {
                for (int i = 1; i < levelList.size(); i++) {
                    int prev = levelList.get(i - 1);
                    if (levelList.get(i) >= prev) return false;
                }
            }
            isOdd = !isOdd;
        }

        return true;
    }
}
