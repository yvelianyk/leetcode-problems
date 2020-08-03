package com.company;

import com.company.Contest200.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        int result = solution.maxSum(
                new int[]{2,4,5,8,10},
                new int[]{4,6,8,9}
        );
        System.out.println(result);
    }
}
