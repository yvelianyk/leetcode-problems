package com.company.BContest23;

import java.util.Arrays;

public class Problem4 {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        boolean allNegative = true;
        boolean allPositiove = true;
        for (int i : satisfaction) {
            if (i >= 0) {
                allNegative = false;
            } else {
                allPositiove = false;
            }
        }
        if (allNegative) return 0;
        if (allPositiove)
            return countSum(satisfaction, 0, satisfaction.length - 1);

        int result = Integer.MIN_VALUE;
        for (int i = 0; i < satisfaction.length; i++) {
            result = Math.max(result, countSum(satisfaction, i, satisfaction.length - 1));
        }

        return result;
    }

    private int countSum(int[] array, int start, int end) {
        int result = 0;
        int counter = 1;
        for (int i = start; i <= end; i++) {
            int i1 = array[i];
            result += i1 * counter++;
        }
        return result;
    }
}
