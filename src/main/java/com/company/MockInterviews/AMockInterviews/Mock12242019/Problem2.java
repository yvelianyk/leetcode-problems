package com.company.MockInterviews.AMockInterviews.Mock12242019;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/number-of-equivalent-domino-pairs/
public class Problem2 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int result = 0;
        for (int[] dominoe : dominoes) {
            int first = Math.max(dominoe[0], dominoe[1]);
            int second = Math.min(dominoe[0], dominoe[1]);
            String key = Integer.toString(first).concat(Integer.toString(second));

            int number = map.getOrDefault(key, 0);
            result += number;
            map.put(key, number + 1);
        }
        return result;
    }

}
