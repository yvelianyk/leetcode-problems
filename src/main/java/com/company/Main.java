package com.company;

import com.company.IslandPerimeter463.IslandPerimeter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        IslandPerimeter solution = new IslandPerimeter();

        int result = solution.islandPerimeter(new int[][]{
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0},
        });
        System.out.println(result);
    }
}
