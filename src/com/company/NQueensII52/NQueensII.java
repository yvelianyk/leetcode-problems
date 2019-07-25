package com.company.NQueensII52;

public class NQueensII {
    public int totalNQueens(int n) {
        int[] placement = new int[n];
        for (int i = 0; i < placement.length; i++) placement[i] = -1;
        return backtrack(placement, 0, 0);
    }

    private int backtrack(int[] placement, int row, int count) {
        if (row == placement.length) {
            count++;
        } else {
            for (int col = 0; col < placement.length; col++) {
                placement[row] = col;
                if (isValid(placement, row)) {
                    count = backtrack(placement, row + 1, count);
                }
                placement[row] = -1;
            }
        }
        return count;
    }

    private boolean isValid(int[] placement, int row) {
        for (int i = 0; i < row; i++) {
            int distance = Math.abs(placement[i] - placement[row]);
            if (distance == 0 || distance == row - i) {
                return false;
            }
        }
        return true;
    }
}
