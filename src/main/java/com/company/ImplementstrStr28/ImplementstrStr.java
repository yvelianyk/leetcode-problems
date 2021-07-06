package com.company.ImplementstrStr28;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength == 0) return 0;

        for(int i = 0; i <= hLength - needleLength; i++) {
            String sub = haystack.substring(i, i + needleLength);
            if (sub.equals(needle)) return i;
        }

        return -1;
    }
}
