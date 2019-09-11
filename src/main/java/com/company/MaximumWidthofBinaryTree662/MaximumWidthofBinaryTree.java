package com.company.MaximumWidthofBinaryTree662;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int result = 1;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(root, 1));

        while (!queue.isEmpty()) {
            int size = queue.size();
            int minPoint = Integer.MAX_VALUE;
            int maxPoint = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                Point pointInstance = queue.poll();
                TreeNode node = pointInstance.node;
                int point = pointInstance.point;

                minPoint = Math.min(minPoint, point);
                maxPoint = Math.max(maxPoint, point);

                if (node.left != null) {
                    queue.add(new Point(node.left, point * 2 - 1));
                }
                if (node.right != null) {
                    queue.add(new Point(node.right, point * 2));
                }
            }

            result = Math.max(result, maxPoint - minPoint + 1);
        }

        return result;
    }

    class Point {
        TreeNode node;
        int point;
        Point(TreeNode node, int point) {
            this.node = node;
            this.point = point;
        }
    }
}
