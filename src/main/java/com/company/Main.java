package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.CountUnivalueSubtrees250.CountUnivalueSubtrees;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

public class Main {

    public static void main(String[] args) {
        CountUnivalueSubtrees solution = new CountUnivalueSubtrees();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,1,5,5,5,null,5]");
        int result = solution.countUnivalSubtrees(root);
        System.out.println("RESULT: " + result);

    }
}
