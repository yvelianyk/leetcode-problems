package com.company.BContest16;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.*;

public class Problem2 {

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        Stack<Integer> levelStackSum = new Stack<>();
        while (!queue.isEmpty()) {
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sum += current.val;
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            levelStackSum.push(sum);
        }

        return levelStackSum.pop();

    }

}
