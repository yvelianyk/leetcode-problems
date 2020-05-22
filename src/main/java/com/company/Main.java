package com.company;

import com.company.BContest26.Problem4;
import com.company.BContest26.Problem4A2;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.MayLeetCodeChallenge.RemoveKDigits;
import com.company.MayLeetCodeChallenge.SingleElementInSortedArray;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RemoveKDigits solution = new RemoveKDigits();
        // [210,77,91,105,3276,881,957,3317,1234]
        //4034
        String result = solution.removeKdigits("1432219", 3);
        System.out.println(result);
    }
}
