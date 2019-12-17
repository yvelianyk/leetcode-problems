package com.company.RottenOranges994;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/rotting-oranges/
public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        Queue<Point> queue = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 2) {
                    Point rottenPoint = new Point(i,j);
                    queue.add(rottenPoint);
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;

        int level = -1;
        int counter = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                Point curr = queue.poll();
                for (int[] direction : directions) {
                    int newX = curr.x + direction[0];
                    int newY = curr.y + direction[1];
                    Point newPoint = new Point(newX, newY);
                    if(
                            newX >= 0 &&
                            newY >= 0 &&
                            newX < grid.length &&
                            newY < grid[0].length &&
                            grid[newX][newY] == 1
                    ) {
                        grid[newX][newY] = 2;
                        counter++;
                        queue.add(newPoint);
                    }
                }
            }
        }
        return counter != fresh ? -1 : level;
    }

    class Point{
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
