package com.company;

import com.company.Contest169.Problem3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Problem3 solution = new Problem3();
        boolean result = solution.canReach(new int[]{4,2,3,0,3,1,2}, 5);
        System.out.println(result);

    }
}
