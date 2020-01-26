package com.company;


import com.company.Contest173.Problem2;
import com.company.Contest173.Problem3;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        // [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]]
        //2
        int result = solution.findTheCity(5, new int[][]{
                {0,1,2},
                {0,4,8},
                {1,2,3},
                {1,4,2},
                {2,3,1},
                {3,4,1},
        }, 2);
        System.out.println(result);

    }
}
