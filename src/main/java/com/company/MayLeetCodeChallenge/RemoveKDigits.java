package com.company.MayLeetCodeChallenge;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);
        StringBuilder result = helper(sb, k);
        return result.length() == 0 ? "0" : new String(result);
    }

    private StringBuilder helper(StringBuilder num, int k) {
        if (k == 0) return num;
        if (k > num.length()) return new StringBuilder();

        int i = 0;
        while (i < num.length() - 1 && num.charAt(i + 1) >= num.charAt(i)) i++;
        num.deleteCharAt(i);
        while(num.length() > 0 && num.charAt(0)=='0') num.deleteCharAt(0);
        return helper(num, k - 1);
    }
}
