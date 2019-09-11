package com.company.SudokuSolver37;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolver {

    private Set<Integer>[] rows = new HashSet[9];
    private Set<Integer>[] cols = new HashSet[9];
    private Set<Integer>[] boxes = new HashSet[9];
    private boolean solved = false;

    public void solveSudoku(char[][] board) {
        initSets(board);
        backtrack(board, 0, 0);
    }

    private void backtrack(char[][] board, int row, int col) {
        if (col == 0 && row == 9) {
            solved = true;
            return;
        }

        int newCol = col + 1;
        int newRow = row;
        if (newCol == 9) {
            newCol = 0;
            newRow = row + 1;
        }

        if (!isFilled(board, row, col)) {
            for (int i = 49; i < 58; i++) {
                if (isValid(row, col, (char) i)) {
                    place(board, row, col, (char) i);
                    backtrack(board, newRow, newCol);
                    if (!solved) remove(board, row, col, (char) i);
                }
            }
        } else {
            backtrack(board, newRow, newCol);
        }

    }

    private void place(char[][] board, int row, int col, char number) {
        int boxNumber = getBoxNumber(row, col);
        board[row][col] = number;
        rows[row].add((int) number);
        cols[col].add((int) number);
        boxes[boxNumber].add((int) number);
    }

    private void remove(char[][] board, int row, int col, char number) {
        int boxNumber = getBoxNumber(row, col);
        board[row][col] = '.';
        rows[row].remove((int) number);
        cols[col].remove((int) number);
        boxes[boxNumber].remove((int) number);
    }

    private int getBoxNumber(int row, int col) {
        return (row / 3) * 3 + col / 3;
    }

    private boolean isValid(int row, int col, char number) {
        int boxNumber = getBoxNumber(row, col);
        boolean isExistInRows = rows[row].contains((int) number);
        boolean isExistInCols = cols[col].contains((int) number);
        boolean isExistInBox = boxes[boxNumber].contains((int) number);
        return !isExistInBox && !isExistInRows && !isExistInCols;
    }

    private boolean isFilled(char[][] board, int row, int col) {
        return board[row][col] != '.';
    }

    private void initSets(char[][] board) {
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<Integer>();
            cols[i] = new HashSet<Integer>();
            boxes[i] = new HashSet<Integer>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int boxNumber = getBoxNumber(i, j);
                char symbol = board[i][j];
                if (symbol != '.') {
                    rows[i].add((int) symbol);
                    cols[j].add((int) symbol);
                    boxes[boxNumber].add((int) symbol);
                }
            }
        }
    }
}
