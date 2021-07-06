package com.company.LonelyPixelI531;

public class LonelyPixel {
    public int findLonelyPixel(char[][] picture) {
        int numOfRows = picture.length;
        int numOfCols = picture[0].length;
        int[] rows = new int[numOfRows];
        int[] cols = new int[numOfCols];
        int result = 0;

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if (picture[i][j] == 'B') {
                    rows[i] = rows[i] + 1;
                    cols[j] = cols[j] + 1;
                }
            }
        }

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                if (picture[i][j] == 'B') {
                    if (rows[i] == 1 && cols[j] == 1) {
                       result++;
                    }
                }
            }
        }

        return result;
    }
}
