package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.AddOneRowToTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AddOneRowToTree solution = new AddOneRowToTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[4,2,6,3,1,5]");

        TreeNode result = solution.addOneRow(root, 1, 2);

        System.out.println(result);
    }
}
