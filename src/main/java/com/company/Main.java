package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.BeautifulArrangements;
import com.company.Challenges.CorrespondingNodeBinTree;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;
import com.company.WaysToSplitIntoThreeSubArrays.WaysToSplit;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WaysToSplit solution = new WaysToSplit();

//        int res = solution.waysToSplit(new int[]{1,2,2,2,5,0});
        int res = solution.waysToSplit(new int[]{0,3,3});
//        int res = solution.waysToSplit(new int[]{3,2,1});
        System.out.println(res);
    }
}
