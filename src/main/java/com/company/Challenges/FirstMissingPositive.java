package com.company.Challenges;

import java.util.TreeSet;

// Could be optimized to O(n) by radix or bucket sort
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (num <= 0) continue;
            set.add(num);
        }

        if (set.size() == 0 || set.first() > 1) return 1;

        int counter = 0;
        int prev = 0;
        for (Integer integer : set) {
            if (counter++ == 0) {
                prev = integer;
                continue;
            }

            if (integer - prev > 1) return prev + 1;
            prev = integer;
        }
        return set.last() + 1;
    }
}
