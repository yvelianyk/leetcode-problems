package com.company.DiagonalTraverse498;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int mIndex = 0;
        int nIndex = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int result[] = new int[m * n];

        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[mIndex][nIndex];
            if ((mIndex + nIndex) % 2 == 0) {
                if (nIndex == n - 1) {
                    mIndex++;
                } else if (mIndex == 0) {
                    nIndex++;
                } else {
                    mIndex--;
                    nIndex++;
                }
            } else {
                if (mIndex == m - 1) {
                    nIndex++;
                } else if (nIndex == 0) {
                    mIndex++;
                } else {
                    mIndex++;
                    nIndex--;
                }
            }
        }
        return result;
    }
}
