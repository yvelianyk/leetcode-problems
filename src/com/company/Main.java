package com.company;

import com.company.BinaryTreePostorderTraversal145.*;
import com.company.ConstrBTreeInorderPreorderTraversal105.ConstrBTreeInorderPreorderTraversal;


public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(7);

        root2.left = root4;
        root2.right = root5;

        root3.left = root6;
        root3.right = root7;

        root.left =  root2;
        root.right = root3;


        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};

        ConstrBTreeInorderPreorderTraversal solution = new ConstrBTreeInorderPreorderTraversal();
        TreeNode res = solution.buildTree(preorder, inorder);


        System.out.println(res);



    }
}
