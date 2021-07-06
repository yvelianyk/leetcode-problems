package com.company.BinaryTreeZigzagLevelOrderTraversal103;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean toLeft = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> levelRes = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (toLeft) {
                    levelRes.add(curr.val);
                } else {
                    stack.push(curr.val);
                }

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            if (!toLeft) {
                while (!stack.isEmpty()) levelRes.add(stack.pop());
            }

            toLeft = !toLeft;

            result.add(levelRes);
        }

        return result;
    }

}
