package com.company.AugustLeetcodeChallenge;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;
        int[] flat = new int[m * n];
        int[][] result = new int[r][c];
        int counter = 0;
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                flat[counter++] = ints[j];
            }
        }
        int resultCounter = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
              result[i][j] = flat[resultCounter++];
            }
        }
        return result;
    }
}
