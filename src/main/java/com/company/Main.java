package com.company;

import com.company.Contest190.Problem4;
import com.company.DungeonGame174.DungeonGame;
import com.company.TargetSum494.TargetSumA2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TargetSumA2 solution = new TargetSumA2();

        // {
        //                {-2,-3,3},
        //                {-5,-10,1},
        //                {10,30,-5},
        //        }
        int result = solution.findTargetSumWays(new int[]{1,1,1,1,1}, 3);
        System.out.println(result);
    }
}
