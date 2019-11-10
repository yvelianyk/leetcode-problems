package com.company;

import com.company.NumberOfClosedIslands1254.NumberOfClosedIslands;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        NumberOfClosedIslands solution = new NumberOfClosedIslands();
        int result = solution.closedIsland(new int[][]{{0,1,1,1,1},{1,0,0,0,1},{1,1,1,1,0},{0,0,1,0,1}});
    }
}
