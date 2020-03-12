package com.company;

import com.company.MockInterviews.GMockInterviews.Mock12032020.Problem2;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int result = solution.maxDistToClosest(new int[]{1,0,0,0});
        System.out.println(result);
    }
}
