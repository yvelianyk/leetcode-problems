package com.company.Challenges;

public class BrokenCalc {
    public int brokenCalc(int X, int Y) {
        return getNum(X, Y, 0);
    }

    private int getNum(int x, int y, int curr) {
        if (y == x) return curr;
        if (y < x) return curr + x - y;
        if (y % 2 == 0) return getNum(x, y / 2, curr + 1);
        return getNum(x, y + 1, curr + 1);
    }
}
