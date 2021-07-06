package com.company.FloodFill733;

public class FloodFillDFS {
    int[][] image;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.image = image;
        int currentColor = image[sr][sc];
        if (currentColor == newColor) return image;
        dfs(sr, sc, currentColor, newColor);
        return image;
    }

    private void dfs(int sr, int sc, int currentColor, int newColor) {
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        image[sr][sc] = newColor;
        for (int[] dir : dirs) {
            int newSr = sr + dir[0];
            int newSc = sc + dir[1];
            if (newSr >= 0 &&
                    newSr < image.length &&
                    newSc >= 0 &&
                    newSc < image[0].length &&
                    image[newSr][newSc] == currentColor
            ) {
                dfs(newSr, newSc, currentColor, newColor);
            }
        }
    }
}
