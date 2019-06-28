package com.company.ConvertSortedArrayToBST108;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return insert(nums, 0, nums.length - 1);
    }

    private TreeNode insert(int[] nums, int start, int end) {
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = insert(nums, start, mid - 1);
        root.right = insert(nums, mid + 1, end);
        return root;
    }
}
