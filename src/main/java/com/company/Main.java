package com.company;

import com.company.Challenges.SubarrayProductLessK;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SubarrayProductLessK solution = new SubarrayProductLessK();

        int res = solution.numSubarrayProductLessThanK(new int[]{1,2,3}, 0);
        System.out.println(res);
    }
}
