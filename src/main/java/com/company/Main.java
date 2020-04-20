package com.company;


import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;
import com.company.ValidateBinarySearchTree98.ValidateBSTRecursion;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ValidateBSTRecursion solution = new ValidateBSTRecursion();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,1]");
        boolean result = solution.isValidBST(root);

        System.out.println(result);
    }
}
