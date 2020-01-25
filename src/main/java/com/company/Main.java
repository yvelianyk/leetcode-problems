package com.company;

import com.company.Contest18.Problem1;
import com.company.Contest18.Problem2;
import com.company.Contest18.Problem3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        int[][] result = solution.diagonalSort(new int[][]{
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2},
        });
        System.out.println(result);

    }
}
