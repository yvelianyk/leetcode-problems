package com.company.Contest176;

import java.util.Arrays;

public class Problem4 {
    public boolean isPossible(int[] target) {
        if (isOne(target)) return true;

        int max = Arrays.stream(target).max().getAsInt();
        int otherSum = 0;
        int maxIndex = -1;
        for (int i = 0; i < target.length; i++) {
            if (target[i] < 1) return false;
            if (target[i] != max) {
                otherSum += target[i];
            } else {
                if (maxIndex != -1) return false;
                maxIndex = i;
            }
        }
        if (otherSum == 0) return false;

        target[maxIndex] = max - otherSum;
        return isPossible(target);
    }

    private boolean isOne(int[] target) {
        for (int value : target) if (value != 1) return false;
        return true;
    }
}
