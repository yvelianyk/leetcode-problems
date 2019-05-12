package com.company.ConstrBTreeInorderPostorderTraversal106;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstrBTreeInorderPostorderTraversal {
    private Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        for (int i = 0; i < inorder.length; i++) inorderMap.put(inorder[i], i);
        TreeNode root = new TreeNode(postorder[0]);

        List<Integer> leftInorder = new ArrayList<>();
        List<Integer> leftPostOrder = new ArrayList<>();
        List<Integer> rightInorder = new ArrayList<>();
        List<Integer> rightPostOrder = new ArrayList<>();

        for (int i = 0; i < inorderMap.get(root.val); i++) {
            leftInorder.add(inorder[i]);
        }
        for (int i = inorderMap.get(root.val) + 1; i < inorder.length; i++) {
            rightInorder.add(inorder[i]);
        }

        return new TreeNode(1);
    }

//    private TreeNode traverse(List<Integer> inorder, List<Integer> postorder) {
//
//    }
}
