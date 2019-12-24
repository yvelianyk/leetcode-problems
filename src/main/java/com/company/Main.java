package com.company;

import com.company.MockInterviews.AmazonMockInterviews.Mock12242019.Problem2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();


        int result = solution.numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}});

        System.out.println(result);

    }
}
