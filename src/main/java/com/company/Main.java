package com.company;


import com.company.Contest182.Problem2;
import com.company.MinCostClimbingStairs746.MinCostClimbingStairs;
import com.company.PaintHouse256.PaintHouse;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinCostClimbingStairs solution = new MinCostClimbingStairs();
        int result = solution.minCostClimbingStairs(new int[] {
                1, 100, 1, 1, 1, 100, 1, 1, 100, 1
        });
        System.out.println(result);
    }
}
