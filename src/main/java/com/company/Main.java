package com.company;

import com.company.MinimumFallingPathSum931.MinimumFallingPathSum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinimumFallingPathSum solution = new MinimumFallingPathSum();

        int result = solution.minFallingPathSum(new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
        });
        System.out.println(result);
    }
}
