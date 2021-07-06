package com.company.JuneLeetcodeChallenge;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 0) return true;
        if (n % 2 == 1) return false;
        return isPowerOfTwo(n / 2);
    }
}
