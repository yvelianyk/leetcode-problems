package com.company;

import com.company.Contest171.Problem3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        int result = solution.makeConnected(6, new int[][]{{0,1},{0,2},{0,3},{1,2},{1,3}});

        System.out.println(result);

    }
}
