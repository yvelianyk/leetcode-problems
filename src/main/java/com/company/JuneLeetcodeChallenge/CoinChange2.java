package com.company.JuneLeetcodeChallenge;

import java.util.Arrays;

public class CoinChange2 {
    int amount;
    int[] coins;
    int[][] memo;
    public int change(int amount, int[] coins) {
        this.amount = amount;
        this.coins = coins;
        memo = new int[amount + 1][coins.length];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return getCombinations(0, 0);
    }

    private int getCombinations(int currentAmount, int position) {
        if (currentAmount == amount) return 1;
        if (currentAmount > amount) return 0;
        if (position == coins.length) return 0;
        if (memo[currentAmount][position] != -1) return memo[currentAmount][position];

        int pick = getCombinations(currentAmount + coins[position], position);
        int notPick = getCombinations(currentAmount, position + 1);
        memo[currentAmount][position] = pick + notPick;
        return pick + notPick;
    }
}
