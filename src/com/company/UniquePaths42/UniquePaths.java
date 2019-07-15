package com.company.UniquePaths42;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i == 0 || j == 0) {
                    matrix[i][j] = 1;
                    continue;
                }
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j-1];
            }
        }
        return matrix[n - 1][m - 1];
    }
}
