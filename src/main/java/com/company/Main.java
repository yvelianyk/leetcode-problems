package com.company;

import com.company.NumOfWaysToStaySame1269.NumOfWaysToStaySame;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        NumOfWaysToStaySame solution = new NumOfWaysToStaySame();

        // int result = solution.findPaths(2,2,2,0,0);
        int result = solution.numWays(4,2);
        System.out.println(result);
    }
}
