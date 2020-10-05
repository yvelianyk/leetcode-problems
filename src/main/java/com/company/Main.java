package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.BContest36.Problem3;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        int[][] res = solution.restoreMatrix(new int[]{5,7,10}, new int[]{8,6,8});
        System.out.println(res);
    }
}
