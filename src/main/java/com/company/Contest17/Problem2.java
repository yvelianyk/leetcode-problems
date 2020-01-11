package com.company.Contest17;

public class Problem2 {

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] result = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                result[i][j] = getCellValue(mat, i, j, K);
            }
        }
        return result;
    }

    private int getCellValue(int[][] mat, int i, int j, int K) {
        int firstR = i - K;
        int lastR = i + K;
        int firstC = j - K;
        int lastC = j + K;

        int sum = 0;
        for (int R = firstR; R <= lastR; R++) {
            if(R < 0 || R >= mat.length) continue;
            for (int C = firstC; C <= lastC; C++) {
                if(C < 0 || C >= mat[0].length) continue;
                sum += mat[R][C];
            }
        }
        return sum;
    }

}
