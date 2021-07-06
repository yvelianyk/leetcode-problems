package com.company.Contest182;

public class Problem2 {

    public int numTeams(int[] rating) {
        int incr = countSubsequences(rating, true);
        int decr = countSubsequences(rating, false);
        return incr + decr;
    }

    private int countSubsequences(int arr[], boolean incr) {
        int length = arr.length;
        int[][] dp = new int[3][length];
        int sum = 0;
        for (int i = 0; i < length; i++) dp[0][i] = 1;
        for (int l = 1; l < 3; l++) {
            for (int i = l; i < length; i++) {
                dp[l][i] = 0;
                for (int j = l - 1; j < i; j++) {
                    boolean condition = incr ? arr[j] < arr[i] : arr[j] > arr[i];
                    if (condition) {
                        dp[l][i] += dp[l - 1][j];
                    }
                }
            }
        }
        for (int i = 2; i < length; i++) sum += dp[2][i];

        return sum;
    }
}
