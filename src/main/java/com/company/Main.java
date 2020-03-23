package com.company;



import com.company.Contest181.Problem3;
import com.company.Contest181.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        // 4
        //[[4,3],[1,4],[4,6],[1,7]]
        boolean result = solution.hasValidPath(new int[][]{
                {1,1,1,1,1,1,3},
        });
        System.out.println(result);
    }
}
