package com.company.BContest34;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    private final long MOD = 1_000_000_007;
    public int numWays(String s) {
        char[] chars= s.toCharArray();
        long ones = 0;
        for (char aChar : chars) if (aChar == '1') ones++;
        if (ones == 0) {
            long l = s.length();
            long res = ((l - 1) * (l - 2)) / 2;
            return (int) (res % MOD);
        }
        if (ones % 3 != 0) return 0;
        long avg = ones / 3;
        long countOnes = 0;
        long first = 0;
        long second = 0;
        for (char aChar : chars) {
            if (aChar == '1') countOnes++;
            else if (countOnes == avg) first++;
            else if (countOnes == avg * 2) second++;
        }
        return (int) ((++first * ++second) % MOD);
    }


}
