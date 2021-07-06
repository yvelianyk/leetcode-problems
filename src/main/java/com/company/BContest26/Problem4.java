package com.company.BContest26;

import java.util.Map;
import java.util.TreeMap;

public class Problem4 {
    int[] cost;
    String result;
    Map<Integer, Integer> costMap;
    public String largestNumber(int[] cost, int target) {
        this.cost = cost;
        result = "0";
        costMap = new TreeMap<>();

        for (int i = cost.length - 1; i >= 0; i--) {
            int prev = costMap.getOrDefault(cost[i], 1);
            costMap.put(cost[i], Math.max(i + 1, prev));
        }

        backtrack(target, new StringBuilder());
        return result;
    }

    private void backtrack(int target, StringBuilder sb) {
        if (target < 0) return;
        if (target == 0) {
            String str = new String(sb);
            if (compareStrings(str, result) > 0) {
                result = str;
            }
            return;
        }

        for (Map.Entry<Integer, Integer> entry : costMap.entrySet()) {
            int number = entry.getValue();
            int cost = entry.getKey();
            String strNumber = String.valueOf(number);
            sb.append(strNumber);
            backtrack(target - cost, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    int compareStrings(String str1, String str2) {
        if (str1.length() < str2.length()) return -1;
        return str1.compareTo(str2);
    }
}
