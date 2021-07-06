package com.company.BContest46;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public String longestNiceSubstring(String s) {
        Set<Character> alphabet = new HashSet<>();
        Set<Character> existing = new HashSet<>();
        char[] chars = s.toCharArray();
        if (chars.length == 1) return "";
        for (char aChar : chars) {
            existing.add(aChar);
            boolean isUpper = Character.isUpperCase(aChar);
            if (isUpper) {
               if (existing.contains(Character.toLowerCase(aChar))) {
                   alphabet.add(aChar);
                   alphabet.add(Character.toLowerCase(aChar));
               }
            } else {
                if (existing.contains(Character.toUpperCase(aChar))) {
                    alphabet.add(aChar);
                    alphabet.add(Character.toUpperCase(aChar));
                }
            }
        }

        int max = 0;
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                Set<Character> ex = new HashSet<>();
                String exString = s.substring(i, j + 1);
                char[] exStrnCh = exString.toCharArray();

                for (char ch : exStrnCh) {
                    ex.add(ch);
                }
                boolean isBreak = false;
                for (char strnCh : exStrnCh) {
                    boolean isUpper = Character.isUpperCase(strnCh);
                    if (isUpper) {
                        if (!ex.contains(Character.toLowerCase(strnCh))) {
                            isBreak = true;
                        }
                    } else {
                        if (!ex.contains(Character.toUpperCase(strnCh))) {
                            isBreak = true;
                        }
                    }
                }
                if (!isBreak && j - i > max) {
                    result = exString;
                    max = j - i;
                }

            }
        }
        return result;
    }

}
