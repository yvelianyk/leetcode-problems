package com.company;

import com.company.BContest26.Problem4;
import com.company.BContest26.Problem4A2;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.MayLeetCodeChallenge.SingleElementInSortedArray;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4A2 solution = new Problem4A2();
        // [210,77,91,105,3276,881,957,3317,1234]
        //4034
        String result = solution.largestNumber(new int[]{210,77,91,105,3276,881,957,3317,1234}, 4034);
        System.out.println(result);
    }
}
