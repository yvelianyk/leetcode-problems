package com.company;

import com.company.AugustLeetcodeChallenge.PathSumIII;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PathSumIII solution = new PathSumIII();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,-2,-3,1,3,-2,null,-1]");
        int result = solution.pathSum(root, -1);
        System.out.println(result);
    }
}
