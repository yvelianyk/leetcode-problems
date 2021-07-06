package com.company.BContest20;

public class Problem3 {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int right = 0;
        int count = 0;

        while (left < s.length() && right < s.length()) {
            if(hasABC(s, left, right)) {
                count++;
                count += s.length() - right - 1;
                left++;
            } else {
                right++;
            }
        }
        return count;
    }

    private boolean hasABC(String s, int left, int right) {
        String sub = s.substring(left, right + 1);
        return sub.indexOf('a') >= 0 && sub.indexOf('b') >= 0 && sub.indexOf('c') >= 0;
    }
}
