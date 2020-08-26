package com.company;

import com.company.AugustLeetcodeChallenge.FizzBuzz;
import com.company.AugustLeetcodeChallenge.IncreasingOrderSearchTree;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FizzBuzz solution = new FizzBuzz();
        List<String> result = solution.fizzBuzz(15);
        System.out.println(result);
    }
}
