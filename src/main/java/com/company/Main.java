package com.company;


import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest174.Problem2;
import com.company.Contest174.Problem3;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        NumberOfConnectedCmpts323 solution = new NumberOfConnectedCmpts323();
        // int result = solution.countComponents(5, new int[][]{{0,1},{1,2},{3,4}});
        int result = solution.countComponents(5, new int[][]{{0,1},{1,2},{3,4}});
        System.out.println(result);

    }
}
