package com.company;

import com.company.BurstBaloons312.BurstBaloons;
import com.company.Contest193.Problem2;
import com.company.Contest193.Problem3;
import com.company.Contest193.TreeAncestor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BurstBaloons solution = new BurstBaloons();
        int res = solution.maxCoins(new int[]{3,1,5,8});
        System.out.println(res);
    }
}
