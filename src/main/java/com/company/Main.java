package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.CorrespondingNodeBinTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CorrespondingNodeBinTree solution = new CorrespondingNodeBinTree();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[7,4,3,null,null,6,19]");
        TreeNode target = root.right.left;
        TreeNode clone = serializer.deserialize("[7,4,3,null,null,6,19]");


        TreeNode res = solution.getTargetCopy(root, clone, target);

        System.out.println(res);
    }
}
