package com.company.Challenges;

import java.util.Arrays;

public class MinElemsGivenSum {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0L;
        for(int num: nums) {
            sum = sum + num;
        }
        if (goal == sum) return 0;
        long target = Math.abs(goal - sum);
        long minElements = 0;

        while (target != 0) {
            if (target >= limit) {
                long times = target / limit;
                target = target % limit;
                minElements = minElements + times;
            } else {
                return (int) minElements + 1;
            }
        }

        return (int) minElements;
    }
}
