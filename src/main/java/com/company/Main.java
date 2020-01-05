package com.company;

import com.company.Contest170.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int[] result = solution.xorQueries(new int[]{1,3,4,8}, new int[][]{{0,1}, {1,2}, {0,3}, {3,3}});
        System.out.println(result);

    }
}
