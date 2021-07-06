package com.company.MockInterviews.GMockInterviews.Mock21042020;

import java.util.HashMap;
import java.util.Map;

// TODO: optimal is KMP
public class Problem2 {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            if (isValid(s, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValid(String s, int substrLength) {
        String equal = s.substring(0, substrLength);
        for (int i = 0; i < s.length(); i = i + substrLength) {
            if (i + substrLength > s.length()) return false;
            String substr = s.substring(i, i + substrLength);
            if (!equal.equals(substr)) return false;
        }
        return true;
    }
}
