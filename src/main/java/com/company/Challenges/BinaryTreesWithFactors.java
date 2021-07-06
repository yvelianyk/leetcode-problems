package com.company.Challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {
    private int[] arr;
    private long[] memo;
    private Map<Integer, Integer> map;
    private int MODULO = 1000000007;

    public int numFactoredBinaryTrees(int[] arr) {
        this.arr = arr;
        this.memo = new long[arr.length];
        this.map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        Arrays.fill(memo, -1);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += getNums(i) % MODULO;
            result %= MODULO;
        }
        return result;
    }

    private long getNums(int index) {
        if (this.memo[index] != -1) return memo[index];
        long result = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[index] % arr[i] != 0) {
                continue;
            }
            if (map.containsKey(arr[index] / arr[i])) {
                result += getNums(i) * getNums(map.get(arr[index] / arr[i]));
            }
        }

        memo[index] = result;
        return result;
    }
}
