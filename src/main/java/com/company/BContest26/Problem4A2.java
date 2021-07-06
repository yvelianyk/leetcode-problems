package com.company.BContest26;

import java.util.Arrays;

public class Problem4A2 {
    String[] memo;
    int[] cost;

    public String largestNumber(int[] cost, int target) {
        this.cost = cost;
        memo = new String[target + 1];
        getMax(target);
        return memo[target] == "" ? "0" : memo[target];
    }

    private String getMax(int target) {
        if (target == 0) return "";
        if (memo[target] != null) {
            return memo[target];
        }
        String curr = "0";
        for (int i = cost.length - 1; i >= 0; i--) {
            int costN = cost[i];
            int number = i + 1;
            if (target - costN >= 0) {
                String next = getMax(target - costN);
                if (next.equals("0")) continue;
                next = String.valueOf(number) + next;
                if (curr.equals("0") || next.length() > curr.length()) curr = next;
            }
        }

        memo[target] = curr;
        return curr;
    }

}
