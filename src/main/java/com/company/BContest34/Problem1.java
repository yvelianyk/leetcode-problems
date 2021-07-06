package com.company.BContest34;

public class Problem1 {
    public int diagonalSum(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        return getLeft(mat, visited) + getRight(mat, visited);
    }

    private int getLeft(int[][] grid, boolean[][] visited) {
        int result = 0;
        int i = 0;
        int j = 0;
        while (i < grid.length && j < grid[0].length && i >= 0 && j >= 0) {
            result += grid[i][j];
            visited[i++][j++] = true;
        }
        return result;
    }

    private int getRight(int[][] grid, boolean[][] visited) {
        int result = 0;
        int i = 0;
        int j = grid[0].length - 1;
        while (i < grid.length && j < grid[0].length && i >= 0 && j >= 0) {
            if (!visited[i][j]) {
                result += grid[i][j];
            }
            i++;
            j--;
        }
        return result;
    }
}
