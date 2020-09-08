package com.company;

import com.company.AugustLeetcodeChallenge.WordPattern;
import com.company.BContest34.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        // "abba"
        //"dog cat cat fish"
        int res = solution.numWays("100100010100110");
        System.out.println(res);
    }
}
