package com.company;

import com.company.BurstBaloons312.BurstBaloons;
import com.company.Contest193.Problem2;
import com.company.Contest193.Problem3;
import com.company.Contest193.TreeAncestor;
import com.company.JuneLeetcodeChallenge.HIndexII;
import com.company.JuneLeetcodeChallenge.SurroundedRegions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        HIndexII solution = new HIndexII();

        int result = solution.hIndex(new int[]{1,4,7,9});
        System.out.println(result);
    }
}
