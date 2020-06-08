package com.company;

import com.company.JuneLeetcodeChallenge.PowerOfTwo;
import com.company.UniquePathsII63.UniquePathsII;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        UniquePathsII solution = new UniquePathsII();

        int result = solution.uniquePathsWithObstacles(new int[][]{
                {1,0},
        });
        System.out.println(result);
    }
}
