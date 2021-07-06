package com.company.Challenges;

import java.util.Arrays;

public class SmallestRangeII {
    int result = Integer.MAX_VALUE;

    public int smallestRangeII(int[] A, int K) {
        backtrack(A, 0, K);
        return result;
    }

    private void backtrack(int[] A, int index, int K) {
        if (index == A.length) {
            int max = Arrays.stream(A).max().getAsInt();
            int min = Arrays.stream(A).min().getAsInt();
            result = Math.min(result, max - min);
            return;
        }
        int cached = A[index];
        A[index] = cached + K;
        backtrack(A, index + 1, K);
        A[index] = cached - K;
        backtrack(A, index + 1, K);
        A[index] = cached;
    }
}
