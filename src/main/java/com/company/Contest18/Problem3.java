package com.company.Contest18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public int[][] diagonalSort(int[][] mat) {
        int[][] result = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || j == 0) {
                    processDiagonal(i, j, mat, result);
                }
            }
        }

        return result;
    }

    private void processDiagonal(int i, int j, int[][] mat, int[][] result) {
        List<Integer> diagonalArray = new ArrayList<>();
        int i2 = i;
        int j2 = j;

        while (i < mat.length && j < mat[0].length) {
            diagonalArray.add(mat[i][j]);
            i++;
            j++;
        }

        Collections.sort(diagonalArray);

        for (Integer number : diagonalArray) {
            result[i2++][j2++] = number;
        }
    }
}
