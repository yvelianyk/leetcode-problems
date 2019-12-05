package com.company;

import com.company.BaseballGame682.BaseballGame;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest165.Contest165Problem1;
import com.company.Contest165.Contest165Problem2;
import com.company.LetterCasePermutation784.LetterCasePermutation;
import com.company.LonelyPixelI531.LonelyPixel;
import com.company.RangeSumOfBST938.RangeSumOfBST;
import com.company.ReorderDataInLogFiles937.ReorderDataInLogFiles;
import com.company.RotateString796.RotateString;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;
import com.company.SumDigitstheMinimumNumber1085.SumDigitstheMinimumNumber;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        RangeSumOfBST solution = new RangeSumOfBST();
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[10,5,15,3,7,null,18]");
        int result = solution.rangeSumBST(root, 7, 15);

        System.out.println(result);

    }
}
