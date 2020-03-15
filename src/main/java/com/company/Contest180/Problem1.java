package com.company.Contest180;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int[] ints : matrix) {
            int[] min = getMin(ints);
            int index = min[1];
            if (isMax(min[0], index, matrix)) {
                result.add(min[0]);
            }
        }
        return result;
    }

    private boolean isMax(int number, int col, int[][] matrix) {
        int max = 0;
        for (int[] ints : matrix) {
            int num = ints[col];
            if (num > max) {
                max = num;
            }
        }
        return number == max;
    }

    private int[] getMin(int[] row) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < row.length; i++) {
            int i1 = row[i];
            if(i1 < min) {
                min = i1;
                index = i;
            }
        }
        return new int[]{min, index};
    }
}
