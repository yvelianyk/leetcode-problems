package com.company.Challenges;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();
        for (int type : candyType) types.add(type);
        return Math.min(types.size(), candyType.length / 2);
    }
}
