package com.company.Contest200;

public class Problem3 {
    int[][] grid;
    int[] zeros;
    int n;
    public int minSwaps(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
        this.zeros = new int[n];
        getZerosAtEnd();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int res = sortRow(i);
            if (res == -1) return res;
            result += res;
        }
        return result;
    }

    private int sortRow(int rowNumber) {
        int required = n - rowNumber - 1;
        int result = 0;
        for (int i = rowNumber; i < zeros.length; i++) {
            int zero = zeros[i];
            if (zero >= required) {
                int index = i;
                while (index > rowNumber) {
                    int temp = zeros[index - 1];
                    zeros[index - 1] = zeros[index];
                    zeros[index] = temp;
                    index--;
                    result++;
                }
                return result;
            }
        }
        return -1;
    }

    private void getZerosAtEnd() {
        for (int i = 0; i < n; i++) {
            boolean isOk = true;
            int count = 0;
            for (int j = n - 1; j >= 0; j--) {
                int number = grid[i][j];
                if(!isOk) continue;
                if (number == 0) {
                    count++;
                } else {
                    isOk = false;
                }
            }
            zeros[i] = count;
        }
    }
}
