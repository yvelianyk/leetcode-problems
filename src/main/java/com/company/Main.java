package com.company;

import com.company.BContest41.Problem1;
import com.company.BContest41.Problem2;
import com.company.BContest41.Problem3;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.PalindromePartitioning;
import com.company.Challenges.SubtreeWithAllDeepest;
import com.company.Challenges.ValidMountainArray;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        SubtreeWithAllDeepest solution = new SubtreeWithAllDeepest();

        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();

        TreeNode res = solution.subtreeWithAllDeepest(serializer.deserialize("[3,5,1,6,2,0,8,null,null,7,4]"));
        System.out.println(res);
    }
}
