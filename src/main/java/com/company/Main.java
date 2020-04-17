package com.company;

import com.company.NumberOfIslands200.NumberOfIslandsUF;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        NumberOfIslandsUF solution = new NumberOfIslandsUF();
        int result = solution.numIslands(new char[][]{
                {'1','1','0','0', '0'},
                {'1','1','0','0', '0'},
                {'0','0','1','0', '0'},
                {'0','0','0','1', '1'},
                {'0','0','0','1', '1'},
        });
        System.out.println(result);
    }
}
