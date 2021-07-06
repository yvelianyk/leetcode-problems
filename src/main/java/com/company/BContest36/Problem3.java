package com.company.BContest36;

public class Problem3 {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] result = new int[rowSum.length][colSum.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                int rowS = rowSum[i];
                int colS = colSum[j];
                if (rowS <= colS) {
                    result[i][j] = rowSum[i];
                    colSum[j] -= rowSum[i];
                    rowSum[i] = 0;
                } else {
                    result[i][j] = colSum[j];
                    rowSum[i] -= colSum[j];
                    colSum[j] = 0;
                }
            }
        }
        return result;
    }
}
