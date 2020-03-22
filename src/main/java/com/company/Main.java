package com.company;



import com.company.Contest181.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        // 4
        //[[4,3],[1,4],[4,6],[1,7]]
        String result = solution.longestPrefix("level");
        System.out.println(result);
    }
}
