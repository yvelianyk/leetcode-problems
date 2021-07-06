package com.company.DungeonGame174;

public class DungeonGame {
    Integer[][] memo;
    int[][] dungeon;
    public int calculateMinimumHP(int[][] dungeon) {
        this.dungeon = dungeon;
        int m = dungeon.length;
        int n = dungeon[0].length;
        this.memo = new Integer[m][n];
        this.memo[m - 1][n - 1] = dungeon[m - 1][n - 1] >= 0 ? 1 : -dungeon[m - 1][n - 1] + 1;
        return getMin(0,0);
    }

    private int getMin(int i, int j) {
        if (i >= dungeon.length || j >= dungeon[0].length) {
            return Integer.MAX_VALUE;
        }

        if (this.memo[i][j] != null) {
            return this.memo[i][j];
        }

        int current = dungeon[i][j];
        int right = getMin(i, j + 1);
        int down = getMin(i + 1, j);
        int res = Math.min(right, down) - current;
        this.memo[i][j] = res <= 0 ? 1 : res;
        return this.memo[i][j];
    }
}
