package com.company;

import com.company.contest13.Contest13Task1;
import com.company.contest13.Contest13Task2;
import com.company.contest3.Shift2DGrid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Shift2DGrid solution = new Shift2DGrid();
        int[][] params = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> result = solution.shift(params,2);

        System.out.println(result);

    }
}
