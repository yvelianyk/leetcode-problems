package com.company.Contest165;

// https://leetcode.com/problems/count-square-submatrices-with-all-ones/
// Problem number is 165
public class Contest165Problem2 {
    public int countSquares(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = matrix[i][j];
                    continue;
                }
                int number = matrix[i][j];
                if (number == 1) {
                    int min1 = Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
                    dp[i][j] = Math.min(min1, dp[i][j - 1]) + 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result += dp[i][j];
            }
        }
        return result;
    }
}
