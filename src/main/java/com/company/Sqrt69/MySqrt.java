package com.company.Sqrt69;

public class MySqrt {
    public int mySqrt(int x) {
        long left = 0;
        long right = x/2;
        if (x == 1) return 1;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long multipl = mid * mid;
            long nextMul = (mid + 1) * (mid + 1);
            if (multipl <= x && nextMul > x) return (int)mid;
            if (multipl <= x) {
                left = mid + 1;
            }
            if (nextMul > x) {
                right = mid - 1;
            }
        }
        return 0;
    }
}
