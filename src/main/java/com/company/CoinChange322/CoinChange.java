package com.company.CoinChange322;

import java.util.Arrays;

public class CoinChange {

    // BOTTOM UP DYNAMIC PROGRAMMING:
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    // TOP DOWN DP:
//    public int coinChange(int[] coins, int amount) {
//        return traverse(coins, amount, new int[amount]);
//    }
//
//    private int traverse(int[] coins, int amount, int[] cache) {
//        if (amount < 0) return -1;
//        if (amount == 0) {
//            return 0;
//        }
//        if (cache[amount - 1] != 0) return cache[amount - 1];
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < coins.length; i++) {
//            int coin = coins[i];
//            int res = traverse(coins, amount - coin, cache);
//            if(res < min && res >= 0) {
//                min = res + 1;
//            }
//        }
//
//        cache[amount - 1] = min == Integer.MAX_VALUE ? -1 : min;
//        return cache[amount - 1];
//    }
}
