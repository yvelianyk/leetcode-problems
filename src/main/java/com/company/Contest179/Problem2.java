package com.company.Contest179;

public class Problem2 {
    public int numTimesAllBlue(int[] light) {
        int max = 0, count = 0;
        for (int i = 0; i < light.length; ++i) {
            max = Math.max(max, light[i]);
            if (max == i + 1) ++count;
        }
        return count;
    }

}
