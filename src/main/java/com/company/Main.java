package com.company;

import com.company.Contest198.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int[][] edges = new int[][] {
                {0,1},
                {1,2},
                {0,3},
        };
        int[] result = solution.countSubTrees(4, edges, "bbbb");
        System.out.println(result);
    }
}
