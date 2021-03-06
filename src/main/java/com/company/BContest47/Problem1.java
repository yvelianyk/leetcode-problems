package com.company.BContest47;

public class Problem1 {
    int locX;
    int locY;
    public int nearestValidPoint(int x, int y, int[][] points) {
        this.locX = x;
        this.locY = y;
        int minDistance = Integer.MAX_VALUE;
        int result = -1;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int distance = getDistance(point[0], point[1]);
                if (distance < minDistance) {
                   result = i;
                   minDistance = distance;
                }
            }
        }

        return result;
    }

    int getDistance(int x, int y) {
        return Math.abs(this.locX - x) + Math.abs(this.locY - y);
    }
}
