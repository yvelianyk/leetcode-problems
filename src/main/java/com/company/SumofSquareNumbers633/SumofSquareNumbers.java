package com.company.SumofSquareNumbers633;

public class SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if(c == 0 || c == 1) return true;
        for (long i = 0; i * i < c ; i++) {
             int number = c - (int)(i * i);
             if(isPerfect(number)) {
                 return true;
             }
        }
        return false;
    }

    private boolean isPerfect(int number) {
        if(number == 0) return true;
        long left = 0;
        long right = number;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long product = mid * mid;
            if(product == number) return true;
            if(product < number) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left * left == number) return true;
        return false;
    }
}
