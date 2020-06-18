package com.company;

import com.company.BurstBaloons312.BurstBaloons;
import com.company.Contest193.Problem2;
import com.company.Contest193.Problem3;
import com.company.Contest193.TreeAncestor;
import com.company.JuneLeetcodeChallenge.HIndexII;
import com.company.JuneLeetcodeChallenge.SurroundedRegions;
import com.company.MaximumSubarray53.MaximumSubarray;
import com.company.MaximumSubarray53.MaximumSubarrayDP;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MaximumSubarrayDP solution = new MaximumSubarrayDP();

        int result = solution.maxSubArray(new int[]{-1,-2});
        System.out.println(result);
    }
}
