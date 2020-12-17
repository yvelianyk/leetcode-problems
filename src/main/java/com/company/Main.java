package com.company;

import com.company.BContest41.Problem1;
import com.company.BContest41.Problem2;
import com.company.BContest41.Problem3;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.NumPairsDivisibleby60;
import com.company.Challenges.PalindromePartitioning;
import com.company.Challenges.SubtreeWithAllDeepest;
import com.company.Challenges.ValidMountainArray;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        NumPairsDivisibleby60 solution = new NumPairsDivisibleby60();

        int res = solution.numPairsDivisibleBy60(new int[]{30,20, 150,100,40});
       // int res = solution.numPairsDivisibleBy60(new int[]{20, 40});
        System.out.println(res);
    }
}
