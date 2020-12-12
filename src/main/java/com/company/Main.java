package com.company;

import com.company.BContest41.Problem1;
import com.company.BContest41.Problem2;
import com.company.BContest41.Problem3;
import com.company.Challenges.ValidMountainArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();
        //"abc"
        //["a","b","c","ab","ac","bc","abc"]  == 7
        int res = solution.stoneGameVI(new int[]{2,4,3}, new int[]{1,6,7});
        System.out.println(res);
    }
}
