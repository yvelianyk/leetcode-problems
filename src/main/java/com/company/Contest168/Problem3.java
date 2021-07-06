package com.company.Contest168;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/
public class Problem3 {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> occurrences = new HashMap<>();

        // No need to count occurrences for the maxSize
        // Because strings of min size will be substrings of maxSize
        countOccurences(s, occurrences, minSize);

        return getMaxFrequency(occurrences, maxLetters);
    }

    // Fill the map with substring occurrences. Use sliding window technique.
    private void countOccurences(String s, Map<String, Integer> occurrences, int size) {
        int stringLength = s.length();
        for (int i = 0; i <= stringLength - size; i++) {
            String substr = s.substring(i, i + size);
            int occurs = occurrences.getOrDefault(substr, 0);
            occurrences.put(substr, occurs + 1);
        }
    }

    private int getMaxFrequency(Map<String, Integer> occurrences, int maxLetters) {
        int max = 0;
        for (Map.Entry<String, Integer> occurrence : occurrences.entrySet()) {
            if(hasNumberOfUniqueChars(occurrence.getKey(), maxLetters)) {
                max = Math.max(max, occurrence.getValue());
            }
        }
        return max;
    }

    private boolean hasNumberOfUniqueChars(String s, int maxLetters) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size() <= maxLetters;
    }
}
