package com.company.Pow50;

import java.util.HashMap;
import java.util.Map;

public class MyPow {


    public double myPow(double x, long n) {
        if (n == 1) return x;
        if (n == 0) return 1;
        if (n == 2) return x * x;
        long absN = Math.abs(n);
        double result;
        double val;
        if (absN % 2 == 0) {
            val = myPow(x, absN / 2);
            result = val * val;
        } else {
            val = myPow(x, (absN - 1) / 2);
            result = val * val * x;
        }

        return n > 0 ? result : 1 / result;
    }

}
