package com.company.MockInterviews.AmazonMockInterviews.Mock12262019;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/cut-off-trees-for-golf-event/
public class Problem2 {
    public int cutOffTree(List<List<Integer>> forest) {
        if (forest == null || forest.size() == 0)
            return 0;

        Point[][] newforest = initForest(forest);

        PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> (a.val - b.val));

        int m = forest.size();
        int n = forest.get(0).size();

        for (int i = 0; i < m; i++) {
            List<Integer> row = forest.get(i);
            for (int j = 0; j < n; j++) {
                if (row.get(j) > 1) {
                    pq.add(newforest[i][j]);
                }
            }
        }

        int cnt = 0;
        int x = 0, y = 0;
        while (!pq.isEmpty()) {
            Point nextPoint = pq.poll();
            int nx = nextPoint.x;
            int ny = nextPoint.y;


            int steps = BFS(newforest[x][y], newforest[nx][ny], newforest);
            if (steps == -1) {
                return -1;
            }
            cnt += steps;
            x = nx;
            y = ny;
        }
        return cnt;

    }

    private Point[][] initForest(List<List<Integer>> forest) {
        Point[][] newForest = new Point[forest.size()][forest.get(0).size()];
        for (int i = 0; i < forest.size(); i++) {
            List<Integer> item = forest.get(i);
            for (int j = 0; j < item.size(); j++) {
                int cell = item.get(j);
                newForest[i][j] = new Point(i, j);
                newForest[i][j].val = cell;
            }
        }

        return newForest;
    }

    int BFS(Point point1, Point point2, Point[][] forest) {
        if (point1.x == point2.x && point1.y == point2.y) return 0;

        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[forest.length][forest[0].length];

        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        queue.add(point1);
        visited[point1.x][point1.y] = true;

        int count = -1;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point curr = queue.poll();

                if (curr == point2) {
                    forest[curr.x][curr.y].val = 1;
                    return count;
                }
                for (int[] direction : directions) {
                    Point newPoint = new Point(curr.x + direction[0], curr.y + direction[1]);
                    if (
                            newPoint.x >= 0 &&
                                    newPoint.x < forest.length &&
                                    newPoint.y >= 0 &&
                                    newPoint.y < forest[0].length &&
                                    !visited[newPoint.x][newPoint.y] &&
                                    forest[newPoint.x][newPoint.y].val > 0
                    ) {
                        visited[newPoint.x][newPoint.y] = true;
                        queue.add(forest[newPoint.x][newPoint.y]);
                    }

                }
            }
        }

        return -1;
    }

    class Point {
        int x;
        int y;
        int val;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
