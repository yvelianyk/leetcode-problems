package com.company.ThirtyDayChellenge;

import java.util.Arrays;

public class LongestCommonSubsequence {
    int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length()][text2.length()];
        for (int[] ints : memo) {
            Arrays.fill(ints, -1);
        }
        StringBuilder sb1 = new StringBuilder(text1);
        StringBuilder sb2 = new StringBuilder(text2);
        return getMax(sb1, sb2, 0, 0);
    }

    private int getMax(StringBuilder sb1, StringBuilder sb2, int index1, int index2) {
        if (index1 == sb1.length() || index2 == sb2.length()) {
            return 0;
        }
        if (memo[index1][index2] != -1) return memo[index1][index2];

        int result = 0;
        if (sb1.charAt(index1) == sb2.charAt(index2)) {
            result = getMax(sb1, sb2, index1 + 1, index2 + 1) + 1;
        } else {
            int res1 = getMax(sb1, sb2, index1 + 1, index2);
            int res2 = getMax(sb1, sb2, index1, index2 + 1);
            result = Math.max(res1, res2);
        }
        memo[index1][index2] = result;
        return result;
    }
}
