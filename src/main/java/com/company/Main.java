package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.MayLeetCodeChallenge.CousinsInBinaryTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CousinsInBinaryTree solution = new CousinsInBinaryTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,null,2,3,null,null,4,null,5]");

        boolean result = solution.isCousins(root, 1,3);
        System.out.println(result);
    }
}
