package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.InvertBinaryTree226.InvertBinaryTree;
import com.company.JuneLeetcodeChallenge.TwoCityScheduling;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TwoCityScheduling solution = new TwoCityScheduling();
        int result = solution.twoCitySchedCost(new int[][]{{22,30},{33,200},{40,50},{30,20}});
        System.out.println(result);
    }
}
