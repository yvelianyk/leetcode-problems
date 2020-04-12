package com.company.OnesAndZeroes474;

import java.util.*;

public class OnesAndZeroes {

    int[][][] memo;

    public int findMaxForm(String[] strs, int m, int n) {
        memo = new int[strs.length][m + 1][n + 1];
        return getMax(strs,0, m, n);
    }

    private int getMax(String[] strs, int index, int m, int n) {
        if(index >= strs.length) return 0;
        if(strs.length == 0) return 0;
        if(m <= 0 && n <= 0) return 0;
        if(memo[index][m][n] != 0) return memo[index][m][n];


        int[] count = count(strs[index]);
        int ifNotTake = getMax(strs, index + 1, m, n);
        int ifTake = 0;
        if (count[0] <= m && count[1] <= n) {
            ifTake = getMax(strs, index +  1, m - count[0], n - count[1]) + 1;
        }

        memo[index][m][n] = Math.max(ifNotTake, ifTake);
        return memo[index][m][n];
    }

    private int[] count(String str) {
        int[] res = new int[2];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                res[0]++;
            } else {
                res[1]++;
            }
        }
        return res;
    }
}
