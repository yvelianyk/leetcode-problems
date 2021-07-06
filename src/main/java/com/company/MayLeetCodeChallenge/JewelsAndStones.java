package com.company.MayLeetCodeChallenge;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        char[] jewChars = J.toCharArray();
        for (char jewChar : jewChars) jewels.add(jewChar);
        char[] stones = S.toCharArray();
        int count = 0;
        for (char stone : stones) {
            if (jewels.contains(stone)) count++;
        }
        return count;
    }
}
