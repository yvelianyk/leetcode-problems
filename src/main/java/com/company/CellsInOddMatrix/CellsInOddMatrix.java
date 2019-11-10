package com.company.CellsInOddMatrix;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class CellsInOddMatrix {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            int[] index = indices[i];
            int ri = index[0];
            int ci = index[1];

            // fill row
            for (int j = 0; j < m; j++) {
                matrix[ri][j] = matrix[ri][j] + 1;
            }

            // fill coll
            for (int j = 0; j < n; j++) {
                matrix[j][ci] = matrix[j][ci] + 1;
            }
        }

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] ints = matrix[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                if(anInt % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
