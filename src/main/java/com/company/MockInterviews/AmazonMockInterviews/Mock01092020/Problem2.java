package com.company.MockInterviews.AmazonMockInterviews.Mock01092020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/prison-cells-after-n-days/
public class Problem2 {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] result = new int[cells.length];
        Map<String, Integer> map = new HashMap<>();
        int lastDays = 0;

        for (int i = 0; i < N; i++) {
            map.put(Arrays.toString(cells), i);
            for (int j = 1; j < cells.length - 1; j++) {
                int left = cells[j - 1];
                int right = cells[j + 1];
                if (left == right) {
                    result[j] = 1;
                } else {
                    result[j] = 0;
                }
            }
            cells = result.clone();
            String newKey = Arrays.toString(cells);
            if (map.containsKey(newKey)) {
                int daysAgo = i + 1 - map.get(newKey);
                int daysLeft = N - (i + 1);
                lastDays = daysLeft % daysAgo;
                break;
            }
        }

        for (int i = 0; i < lastDays; i++) {
            for (int j = 1; j < cells.length - 1; j++) {
                int left = cells[j - 1];
                int right = cells[j + 1];
                if (left == right) {
                    result[j] = 1;
                } else {
                    result[j] = 0;
                }
            }
            cells = result.clone();
        }

        return result;
    }
}
