package com.company.MockInterviews.AmazonMockInterviews.Mock12252019;

// https://leetcode.com/problems/spiral-matrix-ii/
public class Problem2 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        int rowIndex = 0;
        int colIndex = 0;

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        int direction = 'R';
        int counter = 1;

        while(left <= right && top <= bottom) {
            switch (direction) {
                case 'R':
                    while (colIndex < right) {
                        result[rowIndex][colIndex] = counter++;
                        colIndex++;
                    }
                    direction = 'D';
                    top++;
                    break;
                case 'D':
                    while (rowIndex < bottom) {
                        result[rowIndex][colIndex] = counter++;
                        rowIndex++;
                    }
                    direction = 'L';
                    right--;
                    break;
                case 'L':
                    while (colIndex > left) {
                        result[rowIndex][colIndex] = counter++;
                        colIndex--;
                    }
                    direction = 'U';
                    bottom--;
                    break;
                case 'U':
                    while (rowIndex > top) {
                        result[rowIndex][colIndex] = counter++;
                        rowIndex--;
                    }
                    direction = 'R';
                    left++;
                    break;
            }
        }
        result[rowIndex][colIndex] = counter;
        return result;
    }
}
