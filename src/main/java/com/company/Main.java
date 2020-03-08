package com.company;


import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest179.Problem1;
import com.company.Contest179.Problem2;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int sorted = solution.numTimesAllBlue(new int[]{2,1,3,5,4});
        System.out.println(sorted);
    }
}
