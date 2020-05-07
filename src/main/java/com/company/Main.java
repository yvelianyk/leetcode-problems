package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.MayLeetCodeChallenge.CousinsInBinaryTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CousinsInBinaryTree solution = new CousinsInBinaryTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();

        //[1,2,3,null,4]
        //2
        //3
        TreeNode root = serializer.deserialize("[1,2,3,null,4]");

        boolean result = solution.isCousins(root, 2,3);
        System.out.println(result);
    }
}
