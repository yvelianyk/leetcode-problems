package com.company.JuneLeetcodeChallenge;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

// TODO: can do it without backtracking array, just precompute sum
public class RootToLeafSum {
    private int result = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        List<Integer> digits = new ArrayList<>();
        digits.add(root.val);

        traverse(root, digits);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> digits) {
        if (node.left == null && node.right == null) {
            result += countSum(digits);
        }
        if (node.left != null) {
            digits.add(node.left.val);
            traverse(node.left, digits);
            digits.remove(digits.size() - 1);
        }
        if (node.right != null) {
            digits.add(node.right.val);
            traverse(node.right, digits);
            digits.remove(digits.size() - 1);
        }
    }

    private int countSum(List<Integer> digits) {
        int base = 1;
        int sum = 0;
        int size = digits.size();
        for (int i = size - 1; i >=0 ; i--) {
            sum += digits.get(i) * base;
            base *= 10;
        }
        return sum;
    }
}
