package com.company;

import com.company.Contest188.Problem3;
import com.company.FloodFill733.FloodFillDFS;
import com.company.MayLeetCodeChallenge.FindTheTownJudge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FloodFillDFS solution = new FloodFillDFS();

        // [1,3],[1,4],[2,3],[2,4],[4,3]
        int[][] result = solution.floodFill(new int[][]{
                {0,0,0},
                {0,1,1}
        },1,1,1);
        System.out.println(result);
    }
}
