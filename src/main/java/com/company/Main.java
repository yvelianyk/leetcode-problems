package com.company;

import com.company.JuneLeetcodeChallenge.AllPathsFromSourceToTarget;
import com.company.JuneLeetcodeChallenge.BestTiemToBuyAndSellCooldown;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BestTiemToBuyAndSellCooldown solution = new BestTiemToBuyAndSellCooldown();

        int result = solution.maxProfit(new int[]{1,2,3,0,2});
        System.out.println(result);
    }
}
