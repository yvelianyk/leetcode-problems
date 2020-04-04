package com.company;


import com.company.BContest23.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();
        int result = solution.maxSatisfaction(new int[]{-2,5,-1,0,3,-3});
        System.out.println(result);
    }
}
