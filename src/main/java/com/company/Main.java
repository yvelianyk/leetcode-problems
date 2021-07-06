package com.company;

import com.company.Challenges.BinaryTreesWithFactors;
import com.company.Challenges.BuySellStocksWithFee;
import com.company.Challenges.HasAllCodes;
import com.company.Challenges.MinElemsGivenSum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BuySellStocksWithFee solution = new BuySellStocksWithFee();

        int result = solution.maxProfit(new int[]{1,3,7,5,10,3}, 3);

        System.out.println(result);
    }
}
