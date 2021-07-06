package com.company.BContest24;

import java.util.Arrays;

public class Problem4 {

    int mod = 1000000007;
    int[] dp;
    public int numberOfArrays(String s, int k) {
        dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);

        return numOfArr(s, 0, k);
    }

    private int numOfArr(String s, int start, int k) {
        if (start == s.length()) return 1;
        if (s.charAt(start) == '0') return 0;
        if (dp[start] != -1) return dp[start];

        int result = 0;
        long number = 0;
        for (int i = start; i < s.length(); i++) {
            number = number * 10 + s.charAt(i) - '0';
            if (number > k) break;
            result = (result + numOfArr(s, i + 1, k)) % mod;
        }

        dp[start] = result % mod;
        return dp[start];
    }
}
