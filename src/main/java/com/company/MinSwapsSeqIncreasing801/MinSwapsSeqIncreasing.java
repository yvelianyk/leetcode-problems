package com.company.MinSwapsSeqIncreasing801;

public class MinSwapsSeqIncreasing {
    int[] A;
    int[] B;
    Integer[][] memo;
    public int minSwap(int[] A, int[] B) {
        this.A = A;
        this.B = B;
        this.memo = new Integer[A.length][2];
        return getMin(0, -1,-1, 0);
    }

    private int getMin(int step, int prevA, int prevB, int swapped) {
        if (step == A.length) return 0;
        if (memo[step][swapped] != null) return memo[step][swapped];

        int result = Integer.MAX_VALUE;
        int currA = A[step];
        int currB = B[step];
        if (currA > prevA && currB > prevB) {
           result = getMin(step + 1, currA, currB, 0);
        }
        if (currB > prevA && currA > prevB) {
            result = Math.min(result, getMin(step + 1,currB, currA, 1) + 1);
        }

        memo[step][swapped] = result;
        return result;
    }
}
