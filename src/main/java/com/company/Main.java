package com.company;

import com.company.BContest42.Problem1;
import com.company.BContest42.Problem2;
import com.company.Challenges.DecodeWays;
import com.company.Challenges.FourSumII;
import com.company.Challenges.JumpGameIV;
import com.company.Challenges.SmallestRangeII;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JumpGameIV solution = new JumpGameIV();

//        int res = solution.minJumps(new int[]{100,-23,-23,404,100,23,23,23,3,404});
//        int res = solution.minJumps(new int[]{7});
//        int res = solution.minJumps(new int[]{7,6,9,6,9,6,9,7});
        int res = solution.minJumps(new int[]{11,22,7,7,7,7,7,7,7,22,13});

        //double res = solution.averageWaitingTime(new int[][]{{1,2}, {2,5}, {4,3}});
//        int res = solution.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1});
        System.out.println(res);
    }
}
