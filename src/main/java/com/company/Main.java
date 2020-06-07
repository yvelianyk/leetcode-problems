package com.company;

import com.company.Contest192.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        // [1,10],[10,1],[10,1],[1,10],[5,1
//        int result = solution.minCost(new int[]{0,0,0,0,0}, new int[][]{
//                {1,10},
//                {10,1},
//                {10,1},
//                {1,10},
//                {5,1}
//        }, 5,2,3);

//        int result = solution.minCost(new int[]{0,2,1,2,0}, new int[][]{
//                {1,10},
//                {10,1},
//                {10,1},
//                {1,10},
//                {5,1}
//        }, 5,2,3);

        int result = solution.minCost(new int[]{0,0,0,0,0}, new int[][]{
                {1,10},
                {10,1},
                {1,10},
                {10,1},
                {1,10}
        }, 5,2,5);
//        int result = solution.minCost(new int[]{3,1,2,3}, new int[][]{
//                {1,1,1},
//                {1,1,1},
//                {1,1,1},
//                {1,1,1},
//        }, 4,3,3);
        System.out.println(result);
    }
}
