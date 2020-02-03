package com.company;


import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest174.Problem2;
import com.company.Contest174.Problem3;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,2,3,4,5,6]");
        int result = solution.maxProduct(root);
        System.out.println(result);

    }
}
