package com.company;

import com.company.MockInterviews.AmazonMockInterviews.Mock01032020.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int result = solution.numRollsToTarget(1, 6, 3);
        System.out.println(result);

    }
}
