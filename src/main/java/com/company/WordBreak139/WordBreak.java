package com.company.WordBreak139;

import java.util.*;

public class WordBreak {

    private Boolean[] memo;
    private Set<String> wordSet;

    public boolean wordBreak(String s, List<String> wordDict) {
        wordSet = new HashSet<String>(wordDict);
        memo = new Boolean[s.length()];
        return check(s, 0);
    }

    private boolean check(String s, int start) {
        if (start == s.length()) return true;
        if (memo[start] != null) {
            return memo[start];
        }

        for (int end = start + 1; end <= s.length(); end++) {
            if (wordSet.contains(s.substring(start, end))) {
                boolean checkResult = check(s, end);
                memo[start] = checkResult;
                if (checkResult) return true;
            }
        }

        return false;
    }
}
