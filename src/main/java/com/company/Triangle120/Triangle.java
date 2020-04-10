package com.company.Triangle120;

import java.util.List;

public class Triangle {
    private List<List<Integer>> triangle;
    private int[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        this.memo = new int[size][size];
        this.triangle = triangle;
        return getMin(0, 0);
    }

    private int getMin(int i, int j) {
        if (i == triangle.size() - 1) return triangle.get(i).get(j);
        if (memo[i][j] != 0) return memo[i][j];

        memo[i][j] = triangle.get(i).get(j) + Math.min(
                getMin(i + 1, j),
                getMin(i + 1, j + 1)
        );
        return memo[i][j];
    }
}
