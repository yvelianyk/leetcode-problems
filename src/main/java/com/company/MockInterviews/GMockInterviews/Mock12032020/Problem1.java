package com.company.MockInterviews.GMockInterviews.Mock12032020;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int rotatedDigits(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if(isGood(i)) result++;
        }
        return result;
    }

    private boolean isGood(int number) {
        List<Integer> digits = getDigits(number);
        boolean flag = false;
        for (Integer digit : digits) {
            if(digit == 3 || digit == 4 || digit == 7) return false;
            if(digit == 0 || digit == 1 || digit == 8) continue;
            if(digit == 2 || digit == 5 || digit == 6 || digit == 9) flag = true;
        }
        return flag;
    }

    private List<Integer> getDigits(int number) {
        List<Integer> result = new ArrayList<>();

        while (number > 0) {
            result.add(number % 10);
            number = number / 10;
        }
        return result;
    }

}
