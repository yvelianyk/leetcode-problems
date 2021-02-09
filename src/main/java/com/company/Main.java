package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.*;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ConverBSTToGreaterTree solution = new ConverBSTToGreaterTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]");

        TreeNode res = solution.convertBST(root);
        String resstr = serializer.serialize(res);

        System.out.println(res);
    }
}
