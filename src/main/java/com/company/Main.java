package com.company;

import com.company.Challenges.MinimizeDeviationInArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinimizeDeviationInArray solution = new MinimizeDeviationInArray();

        int res = solution.minimumDeviation(new int[]{1,2,3,4});

        System.out.println(res);
    }
}
