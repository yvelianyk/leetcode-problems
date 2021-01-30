package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.MaxNumberOfKSumPairs;
import com.company.Challenges.SmallestStringWithNumericValue;
import com.company.Challenges.VerticalOrderTraversal;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        VerticalOrderTraversal solution = new VerticalOrderTraversal();

        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode tree = serializer.deserialize("[0,5,1,9,null,2,null,null,null,null,3,4,8,6,null,null,null,7]");
        List<List<Integer>> res = solution.verticalTraversal(tree);

        System.out.println(res);
    }
}
