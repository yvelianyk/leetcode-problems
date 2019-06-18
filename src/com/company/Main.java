package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.FindDuplicatedSubtrees652.FindDuplicatedSubtrees;
import com.company.MaximumWidthofBinaryTree662.MaximumWidthofBinaryTree;
import com.company.TrimBinarySearchTree669.TrimBinarySearchTree;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(0);
        TreeNode root3 = new TreeNode(2);
//        TreeNode root4 = new TreeNode(2);
//        TreeNode root5 = new TreeNode(2);
////        TreeNode root6 = new TreeNode(4);
//        TreeNode root7 = new TreeNode(4);

        root.left = root2;
        root.right = root3;

        TrimBinarySearchTree solution = new TrimBinarySearchTree();
        TreeNode res = solution.trimBST(root, 1, 2);

        System.out.println("RESULT: " + res);

    }
}
