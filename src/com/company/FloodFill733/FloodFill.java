package com.company.FloodFill733;

import java.util.*;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<Point> queue = new LinkedList();
        Point root = new Point(sr, sc);
        int rows = image.length;
        int cols = image[0].length;
        int startColor = image[sr][sc];
        if (startColor == newColor) return image;
        queue.add(root);

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            for (int[] direction : directions) {
                Point newPoint = new Point(current.x + direction[0], current.y + direction[1]);
                if (
                        newPoint.x >= 0 &&
                        newPoint.x < rows &&
                        newPoint.y >= 0 &&
                        newPoint.y < cols &&
                        image[newPoint.x][newPoint.y] == startColor
                ) {
                    queue.add(newPoint);
                    image[newPoint.x][newPoint.y] = newColor;
                }
            }

            image[current.x][current.y] = newColor;
        }

        return image;
    }

    class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
