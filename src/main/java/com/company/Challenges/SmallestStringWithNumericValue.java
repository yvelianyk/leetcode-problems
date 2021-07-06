package com.company.Challenges;

import java.util.Arrays;

public class SmallestStringWithNumericValue {
    public String getSmallestString(int n, int k) {
        char[] result = new char[n];
        Arrays.fill(result, 'a');
        k -= n;
        while (k > 0) {
            result[--n] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        return String.valueOf(result);
    }
}
