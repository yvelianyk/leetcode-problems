package com.company.Contest206;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public int numSpecial(int[][] mat) {
        Map<Integer, Integer> onesRows = new HashMap<>();
        Map<Integer, Integer> onesCols = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            int[] row = mat[i];
            int count = 0;
            for (int i1 : row) {
                if (i1 == 1) count++;
                onesRows.put(i, count);
            }
        }

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int[] ints : mat) {
                if (ints[i] == 1) {
                    count++;
                    onesCols.put(i, count);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    int colsR = onesCols.getOrDefault(j, 0);
                    int rowsR = onesRows.getOrDefault(i, 0);
                    if (colsR == 1 && rowsR == 1) result++;
                }
            }
        }
        return result;
    }
}
