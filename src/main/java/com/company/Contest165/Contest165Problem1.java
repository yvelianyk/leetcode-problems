package com.company.Contest165;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/number-of-burgers-with-no-waste-of-ingredients/
public class Contest165Problem1 {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int a1 = 4;
        int b1 = 2;
        int a2 = 1;
        int b2 = 1;

        double def = a1*b2 - b1 * a2;
        double x = ((tomatoSlices * b2 - b1 * cheeseSlices) / def);
        double y = cheeseSlices - x;
        List<Integer> result = new ArrayList<>();

        if (x >= 0 && y >= 0 && (x == Math.floor(x)) && !Double.isInfinite(x) && y == Math.floor(y) && !Double.isInfinite(y)) {
            result.add((int)x);
            result.add((int)y);
        }

        return result;
    }
}
