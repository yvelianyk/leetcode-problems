package com.company.CheckIfItIsaStraightLine1232;

public class CheckIfItIsaStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) return true;
        int[] first = coordinates[0];
        int[] second = coordinates[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] curr = coordinates[i];
            if (
                    (first[1] - second[1]) * (first[0] - curr[0]) !=
                            (first[1] - curr[1]) * (first[0] - second[0]))
            {
                return false;
            }
        }
        return true;
    }
}
