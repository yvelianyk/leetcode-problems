package com.company.WordSearch76;

import java.util.HashSet;
import java.util.Set;

// TODO:
public class WordSearch {

    private boolean result = false;

    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                char aChar = chars[j];
                if (word.charAt(0) == aChar) {
                    String newString = word.substring(1);
                    if (!result) {
                        char temp = board[i][j];
                        board[i][j] = '#';
                        backtrack(board, newString, i, j);
                        board[i][j] = temp;
                    }
                }
            }
        }
        return result;
    }

    private void backtrack(char[][] board, String word, int i, int j) {
        if (board[i][j] == '#') return;
        if(word.length() == 0) {
            result = true;
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        char current = word.charAt(0);

        int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        // [[1,0],[0,1],[-1,0],[0,-1]]
        for (int[] direction : directions) {
            Point newPoint = new Point(i + direction[0], j + direction[1]);
            if (
                    newPoint.x >= 0 &&
                            newPoint.x < rows &&
                            newPoint.y >= 0 &&
                            newPoint.y < cols &&
                            board[newPoint.x][newPoint.y] == current
            ) {
                String newString = word.substring(1);
                char temp = board[newPoint.x][newPoint.y];
                board[newPoint.x][newPoint.y] = '#';
                backtrack(board, newString, newPoint.x, newPoint.y);
                board[newPoint.x][newPoint.y] = temp;
            }
        }

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
