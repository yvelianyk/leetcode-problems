package com.company;

import com.company.Challenges.DecodeWays;
import com.company.Challenges.FourSumII;
import com.company.Challenges.SmallestRangeII;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DecodeWays solution = new DecodeWays();

        int res = solution.numDecodings("1111111111111111111111111111111111111111");
        System.out.println(res);
    }
}
