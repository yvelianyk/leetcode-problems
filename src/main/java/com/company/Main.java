package com.company;

import com.company.Contest180.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        int result = solution.maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2},2);
        System.out.println(result);
    }
}
