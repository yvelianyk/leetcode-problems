package com.company.NumberOfClosedIslands1254;

public class NumberOfClosedIslands {
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int closedIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int anInt = grid[i][j];
                if (anInt == 0) {
                    if (dfs(grid, i, j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean dfs(int[][] grid, int x, int y) {
        if (    x < 0 ||
                x >= grid.length ||
                y < 0 ||
                y >= grid[0].length
        ) {
            return false;
        }
        if(grid[x][y] == 1) return true;
        grid[x][y] = 1;
        boolean result = true;
        for (int[] dir : dirs) {
            result = dfs(grid, x + dir[0], y + dir[1]) && result;
        }
        return result;
    }
}
