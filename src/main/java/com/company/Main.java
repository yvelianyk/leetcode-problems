package com.company;

import com.company.CoinChange322.Solution;
import com.company.NumberOfIslands200.NumberOfIslandsUF;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Solution solution = new Solution();
        int result = solution.coinChange(new int[]{1,2,5}, 11);
        System.out.println(result);
    }
}
