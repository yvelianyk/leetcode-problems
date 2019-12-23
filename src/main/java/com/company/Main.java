package com.company;

import com.company.MockInterviews.AmazonMockInterviews.Problem1_12232019;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem1_12232019 solution = new Problem1_12232019();

        int result = solution.dietPlanPerformance(new int[]{3,2}, 2,0,1);

        System.out.println(result);

    }
}
