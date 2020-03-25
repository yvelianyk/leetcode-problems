package com.company.MockInterviews.GMockInterviews.Mock25032020;

import java.util.Arrays;

public class Problem1 {
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copy[i]) result++;
        }
        return result;
    }
}
