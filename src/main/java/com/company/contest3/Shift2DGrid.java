package com.company.contest3;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>> shift(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        k = k % (n * m);
        int[][] resultInner = new int[n][m];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int nextI = (i + (j + k) / m) % n;
                int nextJ = (j + (k % m)) % m;
                resultInner[nextI][nextJ] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            int[] row = resultInner[i];
            List<Integer> list = new ArrayList<>();
            for (int i1 : row) {
                list.add(i1);
            }
            result.add(list);
        }
        return result;
    }
}
