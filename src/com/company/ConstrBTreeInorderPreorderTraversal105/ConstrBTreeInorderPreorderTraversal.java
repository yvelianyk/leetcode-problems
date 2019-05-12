package com.company.ConstrBTreeInorderPreorderTraversal105;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// CAN BE OPTIMIZED BY NOT USING ARRAY LISTS AND PASSING INDICES
public class ConstrBTreeInorderPreorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        if (preorder.length == 0 && inorder.length == 0) return null;

        for (int i = 0; i < inorder.length; i++) inorderList.add(inorder[i]);
        for (int i = 0; i < preorder.length; i++) preorderList.add(preorder[i]);

        return traverse(preorderList, inorderList);
    }

    private TreeNode traverse(List<Integer> preorder, List<Integer> inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.size(); i++) inorderMap.put(inorder.get(i), i);
        TreeNode root = new TreeNode(preorder.get(0));

        List<Integer> leftInorder = new ArrayList<>();
        List<Integer> leftPreorder = new ArrayList<>();
        List<Integer> rightInorder = new ArrayList<>();
        List<Integer> rigthPreorder = new ArrayList<>();
        for (int i = 0; i < inorderMap.get(root.val); i++) leftInorder.add(inorder.get(i));
        for (int i = inorderMap.get(root.val) + 1; i < inorder.size(); i++) rightInorder.add(inorder.get(i));
        for (int i = 1; i < leftInorder.size() + 1; i++) leftPreorder.add(preorder.get(i));
        for (int i = leftInorder.size() + 1; i < preorder.size(); i++) rigthPreorder.add(preorder.get(i));

        if (leftInorder.size() > 1) root.left = traverse(leftPreorder, leftInorder);
        if (rightInorder.size() > 1) root.right = traverse(rigthPreorder, rightInorder);
        if (leftInorder.size() == 1) root.left = new TreeNode(leftInorder.get(0));
        if (rightInorder.size() == 1) root.right = new TreeNode(rightInorder.get(0));

        return root;
    }

}
