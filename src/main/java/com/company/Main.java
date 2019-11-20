package com.company;

import com.company.CheckIfItIsaStraightLine1232.CheckIfItIsaStraightLine;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CheckIfItIsaStraightLine solution = new CheckIfItIsaStraightLine();

        boolean result = solution.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}});

        System.out.println(result);

    }
}
