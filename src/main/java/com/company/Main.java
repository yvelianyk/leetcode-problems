package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.JuneLeetcodeChallenge.LongestDuplicatedSubstring;
import com.company.JuneLeetcodeChallenge.RootToLeafSum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RootToLeafSum solution = new RootToLeafSum();

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;


        int result = solution.sumNumbers(root);
        System.out.println(result);
    }
}
