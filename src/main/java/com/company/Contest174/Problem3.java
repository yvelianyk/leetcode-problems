package com.company.Contest174;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class Problem3 {
    long modulo = 1000000007;
    int totalSum = 0;
    long maxProduct = 0;

    public int maxProduct(TreeNode root) {
        totalSum = getSum(root);
        checkMaxProduct(root);

        return (int) (maxProduct % modulo);
    }

    private long checkMaxProduct(TreeNode node) {
        if (node == null) return 0;

        long leftSum = checkMaxProduct(node.left);
        long rightSum = checkMaxProduct(node.right);
        long sum = totalSum - (node.val + rightSum + leftSum);

        maxProduct = Math.max((sum * (totalSum - sum)), maxProduct);
        return node.val + leftSum + rightSum;
    }

    private int getSum(TreeNode root) {
        if (root == null) return 0;
        int left = getSum(root.left);
        int right = getSum(root.right);
        return left + right + root.val;
    }
}
