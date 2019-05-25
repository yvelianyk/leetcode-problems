package com.company.ValidPerfectSquare367;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            long midLong = mid * mid;
            if (midLong == num) return true;
            if (midLong < (long)num) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return (left * left) == num || (right * right) == num;
    }
}
