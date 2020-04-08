package com.company.PerfectSqares279;

import java.util.*;

public class PerfectSquaresDP {
    private int[] memo;
    private Map<Integer, List<Integer>> sqrtMap;
    public int numSquares(int n) {
        memo = new int[n + 1];
        sqrtMap = new HashMap<>();
        Arrays.fill(memo, -1);
        return getMin(n);
    }

    private int getMin(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        if (memo[n] != -1) return memo[n];

        List<Integer> nums = getSquareNums(n);
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            min = Math.min(min, getMin(n - num));
        }
        memo[n] = min + 1;
        return memo[n];
    }

    private List<Integer> getSquareNums(int n) {
        if (sqrtMap.containsKey(n)) {
            return sqrtMap.get(n);
        }
        ArrayList<Integer> squareNums = new ArrayList<Integer>();
        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            int square = i*i;
            if(square <= n) squareNums.add(square);
        }

        sqrtMap.put(n, squareNums);
        return squareNums;
    }
}
