package com.company;

import com.company.Challenges.FourSumII;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
      FourSumII solution = new FourSumII();

        int res = solution.fourSumCount(new int[]{0,1,-1}, new int[]{-1,1,0}, new int[]{0,0,1}, new int[]{-1,1,1});
        System.out.println(res);
    }
}
