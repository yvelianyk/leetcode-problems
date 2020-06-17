package com.company.JuneLeetcodeChallenge;

public class SurroundedRegions {
    private int m;
    private int n;
    private char[][] board;
    private boolean[][] visited;
    final int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public void solve(char[][] board) {
        this.board = board;
        this.m = board.length;
        if (m == 0) return;
        this.n = board[0].length;
        this.visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' &&
                        (i == 0 || j == 0 || i == m - 1 || j == n - 1)
                ) {
                    fillBorder(i, j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' &&
                        i > 0 && j > 0 && i < m - 1 && j < n - 1 && !visited[i][j]
                ) {
                    fillRegion(i, j);
                }
            }
        }

    }

    private void fillBorder(int i, int j) {
        visited[i][j] = true;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 &&
                    newI < m && newJ >= 0 &&
                    newJ < n && board[newI][newJ] == 'O' && !visited[newI][newJ]
            ) {
                fillBorder(newI, newJ);
            }
        }
    }

    private void fillRegion(int i, int j) {
        board[i][j] = 'X';
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI > 0 &&
                    newI < m - 1 && newJ > 0 && newJ < n - 1 &&
                    board[newI][newJ] == 'O' && !visited[newI][newJ]
            ) {
                fillRegion(newI, newJ);
            }
        }
    }
}
