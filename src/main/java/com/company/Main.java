package com.company;

import com.company.JuneLeetcodeChallenge.AllPathsFromSourceToTarget;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        AllPathsFromSourceToTarget solution = new AllPathsFromSourceToTarget();

        int[][] edges = new int[][] {
                {1,2},
                {3},
                {3},
                {}
        };
        List<List<Integer>> result = solution.allPathsSourceTarget(edges);
        System.out.println(result);
    }
}
