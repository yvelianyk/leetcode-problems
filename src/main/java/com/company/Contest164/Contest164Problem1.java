package com.company.Contest164;

import java.util.*;

public class Contest164Problem1 {
    // private int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1,1}, {-1,-1}, {-1,1}, {1,-1}};
    public int minTimeToVisitAllPoints(int[][] points) {
        int total = 0;
        for (int i = 1; i < points.length; i++) {
            total += bfs(points[i-1], points[i]);
        }
        return total;
    }

    private int bfs(int[] point1, int[] point2) {
        return Math.max(Math.abs(point2[0] - point1[0]), Math.abs(point2[1] - point1[1]));
    }

//    private int bfs(int[] point1, int[] point2) {
//        Queue<List<Integer>> queue = new LinkedList<>();
//        List<Integer> newPoint1 = new ArrayList<>();
//        newPoint1.add(point1[0]);
//        newPoint1.add(point1[1]);
//        queue.add(newPoint1);
//        Set<List<Integer>> visited = new HashSet<>();
//        int distance = 0;
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                List<Integer> inner = queue.poll();
//                visited.add(inner);
//                if (inner.get(0) == point2[0] && inner.get(1) == point2[1]) {
//                    return distance;
//                }
//                for (int j = 0; j < directions.length; j++) {
//                    int[] direction = directions[j];
//                    int newPointX = inner.get(0) + direction[0];
//                    int newPointY = inner.get(1) + direction[1];
//                    List<Integer> newPoint = new ArrayList<>();
//                    newPoint.add(newPointX);
//                    newPoint.add(newPointY);
//                    if (!visited.contains(newPoint)) {
//                        queue.add(newPoint);
//                    } else {
//                        System.out.println("CONTAINT");
//                    }
//                }
//            }
//            distance++;
//        }
//        return distance;
//    }
}
