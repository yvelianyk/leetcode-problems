package com.company;

import com.company.Contest204.Problem2;
import com.company.Contest204.Problem3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();
        int res = solution.minDays(new int[][]{
                {0,0,0},
                {0,1,0},
                {0,0,0},
        });
        System.out.println(res);
    }
}
