package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest172.Problem1;
import com.company.Contest172.Problem2;
import com.company.Contest172.Problem3;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode tree = serializer.deserialize("[1,2,3]");
        TreeNode result = solution.removeLeafNodes(tree, 1);

        String ser = serializer.serialize(result);
        System.out.println(ser);

    }
}
