package com.company;

import com.company.Contest188.Problem3;
import com.company.MayLeetCodeChallenge.FindTheTownJudge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FindTheTownJudge solution = new FindTheTownJudge();

        // [1,3],[1,4],[2,3],[2,4],[4,3]
        int result = solution.findJudge(1, new int[][]{
        });
        System.out.println(result);
    }
}
