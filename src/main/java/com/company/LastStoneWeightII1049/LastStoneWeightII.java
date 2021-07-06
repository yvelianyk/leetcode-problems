package com.company.LastStoneWeightII1049;

import java.util.*;

public class LastStoneWeightII {

    Map<String, Integer> memo;
    public int lastStoneWeightII(int[] stones) {
        List<Integer> list = new ArrayList<>();
        memo = new HashMap<>();
        for (int stone : stones) list.add(stone);

        return getMin(list, 0);
    }

    private int getMin(List<Integer> list, int sum) {
        if (list.size() <= 0) return sum;

        if (memo.containsKey(getKey(list, sum))) {
            return memo.get(getKey(list,sum));
        }
        int curr = list.get(0);
        int min = Math.min(
          Math.abs(getMin(list.subList(1, list.size()), sum + curr)),
          Math.abs(getMin(list.subList(1, list.size()), sum - curr))
        );

        memo.put(getKey(list, sum), min);
        return min;
    }

    private String getKey(List<Integer> list, int sum) {
        int size = list.size();
        return String.valueOf(size).concat(String.valueOf(sum));
    }
}
