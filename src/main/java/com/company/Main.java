package com.company;

import com.company.AugustLeetcodeChallenge.IncreasingOrderSearchTree;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        IncreasingOrderSearchTree solution = new IncreasingOrderSearchTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[5,3,6,2,4,null,8,1,null,null,null,7,9]");
        TreeNode result = solution.increasingBST(root);
        String des = serializer.serialize(result);
        System.out.println(des);
    }
}
