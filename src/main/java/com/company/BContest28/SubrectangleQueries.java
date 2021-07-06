package com.company.BContest28;

public class SubrectangleQueries {
    private int[][] rectangle;
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        int height = row2 - row1;
        int width = col2 - col1;
        for (int i = row1; i <= row1 + height; i++) {
            for (int j = col1; j <= col1 + width; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
