package com.company.JuneLeetcodeChallenge;

import java.util.Arrays;

// TODO: memory limit exceeded. Need to learn Rabin Karp algorithm
public class LongestDuplicatedSubstring {
    public String longestDupSubstring(String S) {
        int N = S.length();
        String[] suffixes = new String[N];
        for (int i = 0; i < N; i++) suffixes[i] = S.substring(i, N);
        Arrays.sort(suffixes);
        String lrs = "";
        for (int i = 0; i < N - 1; i++) {
            int len = lcp(suffixes[i], suffixes[i + 1]);
            if (len > lrs.length()) lrs = suffixes[i].substring(0, len);
        }
        return lrs;
    }

    private int lcp(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return sb.length();
            sb.append(s1.charAt(i));
        }

        return sb.length();
    }
}
