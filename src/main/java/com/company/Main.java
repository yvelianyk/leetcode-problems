package com.company;

import com.company.Contest188.Problem3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        // [0,1],[0,2],[1,4],[1,5],[2,3],[2,6]
        List<Boolean> hasApple = new ArrayList<>();
        hasApple.add(false);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(false);
        hasApple.add(true);
        hasApple.add(true);
        hasApple.add(false);
        int result = solution.minTime(7, new int[][]{
                {0,1},
                {0,2},
                {1,4},
                {1,5},
                {2,3},
                {2,6},
        }, hasApple);
        System.out.println(result);
    }
}
