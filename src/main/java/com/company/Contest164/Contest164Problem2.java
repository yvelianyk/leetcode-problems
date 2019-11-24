package com.company.Contest164;

import java.util.*;

public class Contest164Problem2 {
    public int countServers(int[][] grid) {
        int count = 0;
        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    count++;
                    rows[i] = rows[i] + 1;
                    cols[j] = cols[j] + 1;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    if (rows[i] == 1 && cols[j] == 1) {
                        count--;
                    }
                }
            }
        }
            return count;
    }

}
