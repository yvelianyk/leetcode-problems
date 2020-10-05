package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest209.Problem2;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        SerializeandDeserializeBinaryTree serialiser = new SerializeandDeserializeBinaryTree();
        TreeNode root = serialiser.deserialize("[11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]");
        boolean res = solution.isEvenOddTree(root);
        System.out.println(res);
    }
}
