package com.company.HappyNumber202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            if (set.contains(n)) return false;
            set.add(n);
            n = getSum(n);
            if (n == 1) return true;
        }
    }

    private int getSum(int n) {
        int result = 0;
        while (n >= 1) {
            int rest = n % 10;
            int left = n - rest;
            result += rest * rest;
            n = left / 10;
        }
        return result;
    }
}
