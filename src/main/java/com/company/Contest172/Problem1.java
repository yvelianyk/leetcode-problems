package com.company.Contest172;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int maximum69Number (int num) {
        List<Integer> digits = getNumDigits(num);
        int result = num;
        for (int i = digits.size() - 1; i >= 0; i--) {
             int digit = digits.get(i);
             if (digit == 9) {
                 digits.set(i, 6);
                 result = Math.max(result, toNumber(digits));
                 digits.set(i, 9);
             } else {
                 digits.set(i, 9);
                 result = Math.max(result, toNumber(digits));
                 digits.set(i, 6);
             }
        }
        return result;
    }

    private int toNumber(List<Integer> digits) {
        int power = digits.size() - 1;
        int result = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            Integer digit = digits.get(i);
            result += digit * (Math.pow(10, power--));
        }
        return result;
    }

    private List<Integer> getNumDigits(int num) {
        List<Integer> result = new ArrayList<>();
        while (num > 0) {
            result.add(num % 10);
            num = num / 10;
        }
        return result;
    }
}
