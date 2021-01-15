package com.company;

import com.company.Challenges.MaxInGeneratedArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MaxInGeneratedArray solution = new MaxInGeneratedArray();

        int res = solution.getMaximumGenerated(3);
        System.out.println(res);
    }
}
