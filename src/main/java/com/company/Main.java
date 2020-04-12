package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;
import com.company.ThirtyDayChellenge.DiameterOfBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,2,3,4,5,6,7]");
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        int result = solution.diameterOfBinaryTree(root);
        System.out.println(result);
    }
}
