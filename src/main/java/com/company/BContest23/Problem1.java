package com.company.BContest23;

import java.util.*;

public class Problem1 {
    public int countLargestGroup(int n) {
        if (n <= 9) return n;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = getSum(i);
             List<Integer> array = map.getOrDefault(getSum(i), new ArrayList<>());
             array.add(i);
             map.put(sum, array);
        }

        int max = Integer.MIN_VALUE;
        for (List<Integer> value : map.values()) {
            max = Math.max(max, value.size());
        }

        int result = 0;
        for (List<Integer> value : map.values()) {
            if (value.size() == max) result++;
        }
        return result;
    }

    private int getSum(int number) {
        int result = 0;

        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        return result;
    }
}
