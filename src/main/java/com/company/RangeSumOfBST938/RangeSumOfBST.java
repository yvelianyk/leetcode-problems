package com.company.RangeSumOfBST938;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        int leftSum = rangeSumBST(root.left, L, R);
        int rightSum = rangeSumBST(root.right, L, R);
        int total = leftSum + rightSum;
        if (root.val >= L && root.val <= R) {
            total += root.val;
        }
        return total;
    }

}
