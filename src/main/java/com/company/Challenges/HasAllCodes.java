package com.company.Challenges;

import java.util.HashSet;
import java.util.Set;

public class HasAllCodes {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        Set<String> unique = new HashSet<>();
        for (int i = 0; i <= n - k; i++) unique.add(s.substring(i, i + k));
        return unique.size() == (int) Math.pow(2.0, k * 1.0);
    }
}
