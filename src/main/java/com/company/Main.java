package com.company;

import com.company.RottenOranges994.RottenOranges;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RottenOranges solution = new RottenOranges();
        int result = solution.orangesRotting(new int[][]{
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        });

        System.out.println(result);

    }
}
