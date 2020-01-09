package com.company;

import com.company.MockInterviews.AMockInterviews.Mock01092020.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int[] result = solution.prisonAfterNDays(new int[]{1,0,0,1,0,0,1,0}, 1000000000);
        System.out.println(result);

    }
}
