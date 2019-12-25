package com.company;

import com.company.MockInterviews.AmazonMockInterviews.Mock12252019.Problem1;
import com.company.MockInterviews.AmazonMockInterviews.Mock12252019.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();


        int[][] result = solution.generateMatrix(4);

        System.out.println(result);

    }
}
