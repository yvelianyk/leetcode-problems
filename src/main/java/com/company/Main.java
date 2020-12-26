package com.company;

import com.company.BContest42.Problem1;
import com.company.BContest42.Problem2;
import com.company.Challenges.DecodeWays;
import com.company.Challenges.FourSumII;
import com.company.Challenges.SmallestRangeII;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        double res = solution.averageWaitingTime(new int[][]{{5,2}, {5,4}, {10,3}, {20,1}});
        //double res = solution.averageWaitingTime(new int[][]{{1,2}, {2,5}, {4,3}});
//        int res = solution.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1});
        System.out.println(res);
    }
}
