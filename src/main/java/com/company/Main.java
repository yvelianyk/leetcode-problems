package com.company;

import com.company.Contest190.Problem4;
import com.company.DungeonGame174.DungeonGame;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DungeonGame solution = new DungeonGame();

        // {
        //                {-2,-3,3},
        //                {-5,-10,1},
        //                {10,30,-5},
        //        }
        int result = solution.calculateMinimumHP(new int[][]{
                {-3,5}
        });
        System.out.println(result);
    }
}
