package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.BeautifulArrangements;
import com.company.Challenges.CorrespondingNodeBinTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BeautifulArrangements solution = new BeautifulArrangements();

        int res = solution.countArrangement(3);

        System.out.println(res);
    }
}
