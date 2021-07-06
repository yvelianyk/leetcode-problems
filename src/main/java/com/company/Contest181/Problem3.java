package com.company.Contest181;

import java.util.LinkedList;
import java.util.Queue;

public class Problem3 {

    private int[][][] directions = new int[][][]{
            {{0, -1}, {0, 1}},
            {{-1, 0}, {1, 0}},
            {{0, -1}, {1, 0}},
            {{0, 1}, {1, 0}},
            {{0, -1}, {-1, 0}},
            {{0, 1}, {-1, 0}},
    };

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == grid.length - 1 && current[1] == grid[0].length - 1) {
                return true;
            }
            int direction = grid[current[0]][current[1]];
            for (int i = 0; i < directions[direction - 1].length; i++) {
                int[] dir = directions[direction - 1][i];
                // instead of the checking all possible valid values
                // just check if you can go back to current from new point
                int newI = current[0] + dir[0];
                int newJ = current[1] + dir[1];
                if (newI < 0 || newI >= m || newJ < 0 || newJ >= n || visited[newI][newJ]) continue;
                int newDirection = grid[newI][newJ];
                boolean flag = false;
                for (int[] newDir : directions[newDirection - 1]) {
                    int I = newI + newDir[0];
                    int J = newJ + newDir[1];

                    if (I == current[0] && J == current[1]) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    visited[newI][newJ] = true;
                    queue.add(new int[]{newI, newJ});
                }
            }
        }

        return false;
    }

}
