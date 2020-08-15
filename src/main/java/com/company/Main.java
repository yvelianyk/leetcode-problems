package com.company;

import com.company.AugustLeetcodeChallenge.NonOverlappingIntervals;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        NonOverlappingIntervals solution = new NonOverlappingIntervals();
        int result = solution.eraseOverlapIntervals(new int[][]{
                {1,2},
                {2,3},
                {3,4},
                {1,3},
        });
        System.out.println(result);
    }
}
