package com.company.Contest184;

public class Problem4 {
    public int numOfWays(int n) {
        long MOD = 1000000007;
        long[][] dp = new long[n][2];
        dp[0][0] = 6; // number of variants with 2 colors
        dp[0][1] = 6; // number of variants with 3 colors

        for (int i = 1; i < n; i++) {
            dp[i][0] = ((dp[i - 1][0] * 3 + dp[i - 1][1] * 2) % MOD);
            dp[i][1] = ((dp[i - 1][0] * 2 + dp[i - 1][1] * 2) % MOD);
        }
        return (int) (dp[n - 1][0] + dp[n - 1][1]);
    }
}
