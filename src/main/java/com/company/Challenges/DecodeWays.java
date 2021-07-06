package com.company.Challenges;

import java.util.Arrays;

public class DecodeWays {
    String str;
    int[] memo;

    public int numDecodings(String s) {
        str = s;
        memo = new int[s.length() + 1];
        Arrays.fill(memo, -1);
        return getMax(0);
    }

    private int getMax(int index) {
        if (memo[index] != -1) return memo[index];
        if (index >= str.length()) return 1;
        int result = 0;
        if (str.charAt(index) != '0') {
            result += getMax(index + 1);
        }
        if (index < str.length() - 1) {
            int intNum = Integer.parseInt(str.substring(index, index + 2));
            if (intNum <= 26 && intNum >= 10) {
                result += getMax(index + 2);
            }
        }
        memo[index] = result;
        return result;
    }
}
