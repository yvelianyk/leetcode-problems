package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.InvertBinaryTree226.InvertBinaryTree;
import com.company.JuneLeetcodeChallenge.TwoCityScheduling;
import com.company.MinSwapsSeqIncreasing801.MinSwapsSeqIncreasing;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinSwapsSeqIncreasing solution = new MinSwapsSeqIncreasing();

        // [3,3,8,9,10]
        //[1,7,4,6,8]
        int result = solution.minSwap(new int[]{3,3,8,9,10}, new int[]{1,7,4,6,8});
        System.out.println(result);
    }
}
