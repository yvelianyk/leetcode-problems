package com.company;

import com.company.MockInterviews.GMockInterviews.Mock10032020.Problem1;
import com.company.MockInterviews.GMockInterviews.Mock10032020.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        int result = solution.networkDelayTime(new int[][]{{1,2,1},{2,3,2},{1,3,4}}, 3, 2);
        System.out.println(result);
    }
}
