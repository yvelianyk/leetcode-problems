package com.company.IslandPerimeter463;

public class IslandPerimeter {
    private final int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private int[][] grid;
    private int[][] visited;
    private int result = 0;
    private int m;
    private int n;

    public int islandPerimeter(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.visited = new int[m][n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] == 0) {
                    traverse(i, j);
                    return result;
                }
            }
        }
        return result;
    }

    private void traverse(int i, int j) {
        visited[i][j] = 1;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 &&
                    newI < m &&
                    newJ >= 0 &&
                    newJ < n &&
                    grid[newI][newJ] == 1
            ) {
                if (visited[newI][newJ] != 1) traverse(newI, newJ);
            } else {
                result++;
            }
        }
    }
}
