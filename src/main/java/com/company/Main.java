package com.company;


import com.company.Contest182.Problem2;
import com.company.PaintHouse256.PaintHouse;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PaintHouse solution = new PaintHouse();
        int result = solution.minCost(new int[][]{
                {17,2,17},
                {16,16,5},
                {14,3,19},
        });
        System.out.println(result);
    }
}
