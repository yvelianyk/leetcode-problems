package com.company;

import com.company.TargetSum494.TargetSumA2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TargetSumA2 solution = new TargetSumA2();

        int result = solution.findTargetSumWays(new int[]{1,1,1,1,1}, 3);
        System.out.println(result);
    }
}
