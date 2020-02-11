package com.company;

import com.company.TheEarliestMomentWhenEveryoneBecomeFriends1101.TheEarliestMomentWhenEveryoneBecomeFriends;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TheEarliestMomentWhenEveryoneBecomeFriends solution = new TheEarliestMomentWhenEveryoneBecomeFriends();

        int[][] logs = new int[][]{
                {20190104,3,4},
                {20190101,0,1},
                {20190107,2,3},
                {20190211,1,5},
                {20190224,2,4},
                {20190301,0,3},
                {20190312,1,2},
                {20190322,4,5},
        };
        int result = solution.earliestAcq(logs, 6);
        System.out.println(result);

    }
}
