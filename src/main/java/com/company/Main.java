package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.SameTree100.SameTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

public class Main {

    public static void main(String[] args) {
        SameTree solution = new SameTree();
        TreeNode tree1;
        TreeNode tree2;
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        tree1 = serializer.deserialize("[1,2,3]");
        tree2 = serializer.deserialize("[1,2,3]");
        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println(result);
    }
}
