package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.*;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BipartiteGraph solution = new BipartiteGraph();

        boolean res = solution.isBipartite(new int[][]{{1,3},{0,2},{1,3},{0,2}});

//        boolean res = solution.isBipartite(new int[][]{{},{2},{},{1}, {}});

//        boolean res = solution.isBipartite(new int[][]{{1,2,3},{0,2},{0,1,3},{0,2}});

        System.out.println(res);
    }
}
