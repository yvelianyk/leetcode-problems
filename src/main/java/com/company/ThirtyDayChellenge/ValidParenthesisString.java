package com.company.ThirtyDayChellenge;

import java.util.Arrays;
import java.util.Stack;

// DP
public class ValidParenthesisString {
    int[][] memo;
    public boolean checkValidString(String s) {
        int length = s.length();
        memo = new int[length][length];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return isValid(s, length,0, 0);
    }

    private boolean isValid(String s, int length, int index, int count) {
        if (index == length && count == 0) return true;
        if (count < 0 || index >= length) return false;
        if (memo[index][count] != -1) return memo[index][count] == 1;

        char curr = s.charAt(index);
        boolean result = true;
        if(curr == '(') result = isValid(s,length, index + 1, count + 1);
        if(curr == ')') result = isValid(s,length, index + 1, count - 1);
        if(curr == '*') result = isValid(s,length, index + 1, count - 1) ||
                isValid(s,length, index + 1, count + 1) ||
                isValid(s,length, index + 1, count);

        memo[index][count] = result ? 1 : 0;
        return result;
    }
}
