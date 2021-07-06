package com.company.SpiralMatrix54;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) return result;
        int rowIndex = 0;
        int colIndex = 0;

        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int direction = 'R';

        while(left <= right && top <= bottom) {
            switch (direction) {
                case 'R':
                    while (colIndex < right) {
                        result.add(matrix[rowIndex][colIndex]);
                        colIndex++;
                    }
                    direction = 'D';
                    top++;
                    break;
                case 'D':
                    while (rowIndex < bottom) {
                        result.add(matrix[rowIndex][colIndex]);
                        rowIndex++;
                    }
                    direction = 'L';
                    right--;
                    break;
                case 'L':
                    while (colIndex > left) {
                        result.add(matrix[rowIndex][colIndex]);
                        colIndex--;
                    }
                    direction = 'U';
                    bottom--;
                    break;
                case 'U':
                    while (rowIndex > top) {
                        result.add(matrix[rowIndex][colIndex]);
                        rowIndex--;
                    }
                    direction = 'R';
                    left++;
                    break;
            }

        }
        result.add(matrix[rowIndex][colIndex]);

        return result;
    }
}
