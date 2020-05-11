package com.company.WordSearch76;

public class WordSearchA2 {
    private char[][] board;
    private String word;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isExists(i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean isExists(int i, int j, int wordIndex) {
        if (board[i][j] != word.charAt(wordIndex)) return false;
        if (wordIndex == word.length() - 1) return true;
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        char temp = word.charAt(wordIndex);
        board[i][j] = '#';
        boolean result = false;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 &&
                    newI < board.length &&
                    newJ >= 0 &&
                    newJ < board[0].length &&
                    board[newI][newJ] != '#'
            ) {
                result = result || isExists(newI, newJ, wordIndex + 1);
            }
        }
        board[i][j] = temp;
        return result;
    }
}
