package com.company.Challenges;

public class OneSegments {
    public boolean checkOnesSegment(String s) {
        if (s.equals("1")) return true;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            char aChar = chars[i];
            char prev = chars[i - 1];
            if (prev == '1' && aChar == '0') return !check(s.substring(i + 1));
        }
        return chars[0] == '1';
    }

    private boolean check(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '1') return true;
        }
        return false;
    }
}
