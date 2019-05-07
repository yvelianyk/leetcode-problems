package com.company.ZeroOneMatrix542;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < result.length; i++) {
            int[] ints = result[i];
            for (int j = 0; j < ints.length; j++) {
                result[i][j] = matrix[i][j] != 0 ? findNearestDistance(new Point(i, j), matrix) : 0;
            }
        }
        return result;
    }

    private int findNearestDistance(Point point, int[][] matrix) {
        int value = matrix[point.x][point.y];
        int result = 0;
        if (value == 0) return result;
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int rows = matrix.length;
        int cols = matrix[0].length;

        Queue<Point> queue = new LinkedList();
        queue.add(point);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                Point curr = queue.poll();
                for (int[] direction : directions) {
                    Point newPoint = new Point(curr.x + direction[0], curr.y + direction[1]);

                    if (
                      newPoint.x >= 0 &&
                      newPoint.x < rows &&
                      newPoint.y >= 0 &&
                      newPoint.y < cols
                    ) {
                        int nextValue = matrix[newPoint.x][newPoint.y];
                        if (nextValue == 0) {
                            return level;
                        } else {
                            queue.add(newPoint);
                        }
                    }
                }
            }
        }

        return level;
    }

    class Point {
        int x;
        int y;
        Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
}
