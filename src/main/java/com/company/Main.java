package com.company;

import com.company.Challenges.BrokenCalc;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BrokenCalc solution = new BrokenCalc();
        int result = solution.brokenCalc(2,3);

        System.out.println(result);
    }
}
