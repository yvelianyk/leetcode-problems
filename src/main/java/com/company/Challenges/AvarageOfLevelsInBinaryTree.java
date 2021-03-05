package com.company.Challenges;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvarageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Double> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            long total = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                total += curr.val;
                if (curr.right != null) queue.add(curr.right);
                if (curr.left != null) queue.add(curr.left);
            }
            result.add(total * 1.0 / size);
        }
        return result;
    }
}
