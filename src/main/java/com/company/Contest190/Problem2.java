package com.company.Contest190;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem2 {
    Set<Character> vowels;
    public int maxVowels(String s, int k) {
        initVowels();
        int left = 0;
        int right = k - 1;
        int count = 0;
        int result = 0;
        for (int i = 0; i <= right; i++) {
             if (isVowel(s.charAt(i))) count++;
        }
        left++;
        right++;
        result = Math.max(result, count);
        while (right < s.length()) {
            if (isVowel(s.charAt(left - 1))) {
                count = count - 1;
            }
            if (isVowel(s.charAt(right))) {
                count = count + 1;
            }
            result = Math.max(result, count);
            left++;
            right++;
        }
        return result;
    }

    private void initVowels() {
        vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    private boolean isVowel(char ch) {
        return vowels.contains(ch);
    }
}
