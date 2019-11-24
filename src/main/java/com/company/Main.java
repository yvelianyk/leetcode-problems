package com.company;

import com.company.Contest164.Contest164Problem1;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Contest164Problem1 solution = new Contest164Problem1();

        int result = solution.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}});

        System.out.println(result);

    }
}
