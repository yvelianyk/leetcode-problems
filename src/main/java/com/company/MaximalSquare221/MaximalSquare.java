package com.company.MaximalSquare221;

import java.util.HashMap;
import java.util.Map;

// TODO: analyze official solution
public class MaximalSquare {

    private Map<String, Boolean> memo;

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        if (matrix.length == 0) return 0;
        memo = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char aChar = matrix[i][j];
                if(aChar == '1') {
                    max = Math.max(max, getSquare(matrix, i, j));
                }
            }
        }
        return max;
    }

    private int getSquare(char[][] matrix, int i, int j) {
        int counter = 0;
        int bottomI = i;
        int bottomJ = j;
        while (bottomI < matrix.length && bottomJ < matrix[0].length) {
            if (check(matrix, i, j, bottomI++, bottomJ++)) {
               counter++;
            } else {
                break;
            }
        }
        return counter * counter;
    }

    private boolean check(char[][] matrix, int i, int j, int bottomI, int bottomJ) {
        if (i == bottomI && j == bottomJ) {
            return matrix[i][j] == '1';
        }

        String key = getKey(i,j,bottomI,bottomJ);
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        boolean isRowOnes = true;
        boolean isColOnes = true;
        for (int k = i; k <= bottomI; k++) {
            isColOnes = isColOnes && matrix[k][j] == '1';
        }
        for (int k = j; k <= bottomJ; k++) {
            isRowOnes = isRowOnes && matrix[i][k] == '1';
        }
        boolean res = isColOnes && isRowOnes && check(matrix, i + 1, j + 1, bottomI, bottomJ);
        memo.put(key, res);
        return res;
    }

    private String getKey(int i, int j, int bottomI, int bottomJ) {
        return String.valueOf(i).concat(String.valueOf(j)).concat(String.valueOf(bottomI).concat(String.valueOf(bottomJ)));
    }
}
