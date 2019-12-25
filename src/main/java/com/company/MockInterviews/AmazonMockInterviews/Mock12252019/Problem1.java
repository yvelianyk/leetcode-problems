package com.company.MockInterviews.AmazonMockInterviews.Mock12252019;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/rotting-oranges/
public class Problem1 {
    public int orangesRotting(int[][] grid) {
        Queue<Point> queue = new LinkedList<>();
        int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};

        int freshCounter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int cell = grid[i][j];
                if (cell == 2) {
                    queue.add(new Point(i, j));
                }
                if (cell == 1) {
                    freshCounter++;
                }
            }
        }

        if (freshCounter == 0) return 0;

        int minutes = -1;
        int rotten = 0;
        while (!queue.isEmpty()) {
            minutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point curr = queue.poll();
                for (int j = 0; j < directions.length; j++) {
                    int[] direction = directions[j];
                    Point newPoint = new Point(curr.x + direction[0], curr.y + direction[1]);
                    if(
                            newPoint.x >= 0 &&
                                    newPoint.x < grid.length &&
                                    newPoint.y >= 0 &&
                                    newPoint.y < grid[0].length &&
                                    grid[newPoint.x][newPoint.y] == 1
                    ) {
                        queue.add(newPoint);
                        grid[newPoint.x][newPoint.y] = 2;
                        rotten++;
                    }
                }
            }
        }

        return rotten != freshCounter ? -1 : minutes;

    }

    class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
