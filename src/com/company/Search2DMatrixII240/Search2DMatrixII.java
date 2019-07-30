package com.company.Search2DMatrixII240;

public class Search2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        if (matrix[0].length == 0) return false;
        return traverse(matrix, 0, matrix[0].length - 1, target);
    }

    private boolean traverse(int[][] matrix, int row, int col, int target) {
        if (row >= matrix.length || col < 0) {
            return false;
        }
        if (matrix[row][col] == target) {
            return true;
        }

        if (target < matrix[row][col]) {
            return traverse(matrix, row, col - 1, target);
        }
        if (target > matrix[row][col]) {
            return traverse(matrix, row + 1, col, target);
        }
        return false;
    }
}
