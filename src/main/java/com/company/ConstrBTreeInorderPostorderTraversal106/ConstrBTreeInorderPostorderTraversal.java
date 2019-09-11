package com.company.ConstrBTreeInorderPostorderTraversal106;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// CAN BE OPTIMIZED BY NOT USING ARRAY LISTS AND PASSING INDICES
public class ConstrBTreeInorderPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> postorderList = new ArrayList<>();
        List<Integer> inorderList = new ArrayList<>();
        if (postorder.length == 0 && inorder.length == 0) return null;

        for (int i = 0; i < inorder.length; i++) inorderList.add(inorder[i]);
        for (int i = 0; i < postorder.length; i++) postorderList.add(postorder[i]);

        return traverse(inorderList, postorderList);
    }

    private TreeNode traverse(List<Integer> inorder, List<Integer> postorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.size(); i++) inorderMap.put(inorder.get(i), i);
        TreeNode root = new TreeNode(postorder.get(postorder.size() - 1));

        List<Integer> leftInorder = new ArrayList<>();
        List<Integer> leftPostorder = new ArrayList<>();
        List<Integer> rightInorder = new ArrayList<>();
        List<Integer> rigthPostorder = new ArrayList<>();
        for (int i = 0; i < inorderMap.get(root.val); i++) leftInorder.add(inorder.get(i));
        for (int i = inorderMap.get(root.val) + 1; i < inorder.size(); i++) rightInorder.add(inorder.get(i));
        for (int i = 0; i < leftInorder.size(); i++) leftPostorder.add(postorder.get(i));
        for (int i = leftInorder.size(); i < postorder.size() - 1; i++) rigthPostorder.add(postorder.get(i));

        if (leftInorder.size() > 1) root.left = traverse(leftInorder, leftPostorder);
        if (rightInorder.size() > 1) root.right = traverse(rightInorder, rigthPostorder);
        if (leftInorder.size() == 1) root.left = new TreeNode(leftInorder.get(0));
        if (rightInorder.size() == 1) root.right = new TreeNode(rightInorder.get(0));

        return root;
    }


}
