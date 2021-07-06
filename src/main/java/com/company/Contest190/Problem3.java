package com.company.Contest190;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    int counter;
    public int pseudoPalindromicPaths (TreeNode root) {
        counter = 0;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(root.val, 1);
        traverse(root, count);
        return counter;
    }

    private void traverse(TreeNode node, Map<Integer, Integer> count) {
        if (node.left == null && node.right == null) {
            if(isPalindrome(count)) {
                counter++;
            }
            return;
        }

        if (node.left != null) {
            count.put(node.left.val, count.getOrDefault(node.left.val, 0) + 1);
            traverse(node.left, count);
            if (count.get(node.left.val) - 1 == 0) {
                count.remove(node.left.val);
            } else {
                count.put(node.left.val, count.get(node.left.val) - 1);
            }
        }
        if (node.right != null) {
            count.put(node.right.val, count.getOrDefault(node.right.val, 0) + 1);
            traverse(node.right, count);
            if (count.get(node.right.val) - 1 == 0) {
                count.remove(node.right.val);
            } else {
                count.put(node.right.val, count.get(node.right.val) - 1);
            }

        }

    }

    private boolean isPalindrome(Map<Integer, Integer> count) {
        int countOdd = 0;
        for (Integer value : count.values()) {
            if (value % 2 == 1) {
                countOdd++;
            }
            if (countOdd > 1) return false;
        }
        return true;
    }
}
