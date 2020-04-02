package com.company;


import com.company.Contest182.Problem2;
import com.company.MinCostClimbingStairs746.MinCostClimbingStairs;
import com.company.PaintFence276.PaintFence;
import com.company.PaintHouse256.PaintHouse;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PaintFence solution = new PaintFence();
        int result = solution.numWays(4,2);
        System.out.println(result);
    }
}
