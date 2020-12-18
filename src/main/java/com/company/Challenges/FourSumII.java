package com.company.Challenges;

import java.util.HashMap;
import java.util.Map;

public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> map = new HashMap<>();

        int n = A.length, result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = A[i] + B[j];
                if (map.containsKey(-sum))
                    result += map.get(-sum);
            }
        }

        return result;
    }
}
