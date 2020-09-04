package com.company.Contest204;

public class Problem3 {
    private int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private int m;
    private int n;

    public int minDays(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        int initNumber = numberOfIslands(grid);
        if (initNumber > 1 || initNumber == 0) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    int num = numberOfIslands(grid);
                    if (num > 1 || num == 0) return 1;
                    grid[i][j] = 1;
                }
            }
        }
        return 2;
    }

    private int numberOfIslands(int[][] grid) {
        int result = 0;
        int[][] visited = new int[m][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    result++;
                    DFS(grid, i, j, visited);
                }
            }
        }
        return result;
    }

    private void DFS(int[][] grid, int i, int j, int[][] visited) {
        visited[i][j] = 1;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (
                    newI >= 0 &&
                    newI < m &&
                    newJ >= 0 &&
                    newJ < n &&
                    grid[newI][newJ] == 1 &&
                    visited[newI][newJ] == 0
            ) {
                DFS(grid, newI, newJ, visited);
            }
        }
    }
}
