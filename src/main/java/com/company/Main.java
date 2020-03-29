package com.company;


import com.company.Contest182.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();
        int result = solution.numTeams(new int[]{2, 6, 4, 5, 7});
        System.out.println(result);
    }
}
