package com.company;

import com.company.BinaryTreePostorderTraversal145.*;
import com.company.PathSum112.PathSum;
import com.company.SymmetricTree.SymmetricTree101;

import java.nio.file.Path;


public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(4);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(3);

        root2.left = root4;
        root2.right = root5;

        root3.left = root6;
        root3.right = root7;

        root.left =  root2;
        root.right = root3;


        PathSum solution = new PathSum();
        boolean res = solution.hasPathSum(root, 6);

        System.out.println(res);



    }
}
