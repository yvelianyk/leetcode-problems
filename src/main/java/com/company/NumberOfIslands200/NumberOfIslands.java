package com.company.NumberOfIslands200;

import java.util.*;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0, l = grid.length; i < l; i++) {
            char[] chars = grid[i];
            for (int j = 0, l1 = chars.length; j < l1; j++) {
                char aChar = chars[j];
                if (aChar == '1') {
                    result++;
                    DFS(grid, i, j);
                }
            }
        }

        return result;
    }

    private void DFS(char[][] grid, int i, int j) {
        int[][] dirs = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        Stack<Point> stack = new Stack<Point>();
        grid[i][j] = '0';
        stack.push(new Point(i, j));

        while (!stack.isEmpty()) {
            Point current = stack.pop();
            for (int[] dir : dirs) {
                Point newPoint = new Point(current.x + dir[0], current.y + dir[1]);
                    if (
                        newPoint.x >= 0 &&
                                newPoint.x < grid.length &&
                                newPoint.y >=0 &&
                                newPoint.y < grid[0].length &&
                                grid[newPoint.x][newPoint.y] == '1'
                ) {
                    grid[newPoint.x][newPoint.y] = '0';
                    stack.push(newPoint);
                }
            }

        }

    }

    private class Point {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }



    // BFS SOLUTION:


//    public int numIslands(char[][] grid) {
//        int islands = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                char root = grid[i][j];
//                if (root == 49) {
//                    islands++;
//                    BFS(grid, i, j);
//                }
//            }
//        }
//        return islands;
//    }
//
//    private void BFS(char[][]grid, int i, int j) {
//        class Pointer {
//            public int x;
//            public int y;
//            Pointer(int x, int y) {
//                this.x = x;
//                this.y = y;
//            }
//        }
//
//        int rows = grid.length;
//        int cols = grid[0].length;
//        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
//        Queue<Pointer> queue = new LinkedList<Pointer>();
//        grid[i][j] = '0';
//        queue.add(new Pointer(i, j));
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            Pointer current = queue.poll();
//            for (int k = 0; k < size; k++) {
//                for(int[] dir: directions) {
//                    int nextX = current.x + dir[0];
//                    int nextY = current.y + dir[1];
//                    if(
//                            nextX >= 0 &&
//                                    nextY >= 0 &&
//                                    nextX < rows &&
//                                    nextY < cols &&
//                                    grid[nextX][nextY] == 49
//                    ) {
//                        grid[nextX][nextY] = '0';
//                        queue.add(new Pointer(nextX, nextY));
//                    }
//                }
//            }
//        }
//
//    }

}
