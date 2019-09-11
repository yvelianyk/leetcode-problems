package com.company.ReverseInteger7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseInteger {
    public int reverse(int x) {
        if(x == 0) return x;
        boolean isNegative = x < 0;
        List<Long> list = new ArrayList<>();
        int abs = Math.abs(x);

        long temp = 1;
        int length = 0;
        while (temp <= abs) {
            temp *= 10;
            long number = abs % temp;
            if (list.size() > 0) {
                long prev = list.get(list.size() - 1);
                number = (number - prev) / (temp / 10);
            }
            list.add(number);
            length++;
        }

        int base = 1;
        long res = 0;

        while (length > 0) {
            res += list.get(--length) * base;
            base *= 10;
        }

        if (res > Integer.MAX_VALUE) return 0;

        return isNegative ? -(int)res : (int)res;
    }
}
