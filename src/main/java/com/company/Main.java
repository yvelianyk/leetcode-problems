package com.company;

import com.company.MaximalSquare221.MaximalSquare;
import com.company.OnesAndZeroes474.OnesAndZeroes;
import com.company.ThirtyDayChellenge.LastStoneWeight;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MaximalSquare solution = new MaximalSquare();
        int result = solution.maximalSquare(new char[][]{
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
                {'1','1','1','1','1'},
        });
        System.out.println(result);
    }
}
