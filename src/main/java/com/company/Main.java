package com.company;

import com.company.Challenges.MinimizeDeviationInArray;
import com.company.Challenges.MinimumDeletions;
import com.company.Challenges.SimplifyPath;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinimumDeletions solution = new MinimumDeletions();

        int res = solution.minimumDeletions("aababbab");

        System.out.println(res);
    }
}
