package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.InvertBinaryTree226.InvertBinaryTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InvertBinaryTree solution = new InvertBinaryTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[4,2,7,1,3,6,9]");
        TreeNode result = solution.invertTree(root);
        System.out.println(result);
    }
}
