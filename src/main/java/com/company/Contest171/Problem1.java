package com.company.Contest171;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i <= n - 1; i++) {
            Set<Integer> numberInfo1 = getNumberInfo(i);
            Set<Integer> numberInfo2 = getNumberInfo(n - i);
            if (!numberInfo1.contains(0) && !numberInfo2.contains(0)) {
                return new int[]{i, n - i};
            }
        }
        return new int[]{};
    }

    private Set<Integer> getNumberInfo(int number) {
        Set<Integer> set = new HashSet<>();
        while (number > 0) {
            set.add(number % 10);
            number = number / 10;
        }
        return set;
    }
}
