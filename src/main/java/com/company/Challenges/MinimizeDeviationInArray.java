package com.company.Challenges;

import java.util.TreeSet;

public class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) set.add(num % 2 == 1 ? num * 2 : num);
        int result = set.last() - set.first();
        while (set.last() % 2 == 0) {
            int last = set.last();
            set.remove(last);
            set.add(last / 2);
            result = Math.min(result, set.last() - set.first());
        }
        return result;
    }
}
