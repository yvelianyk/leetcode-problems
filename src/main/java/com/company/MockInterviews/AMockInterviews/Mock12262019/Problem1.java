package com.company.MockInterviews.AMockInterviews.Mock12262019;

import java.util.*;

// https://leetcode.com/problems/most-common-word/
public class Problem1 {

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = paragraph.split("[\\p{Punct}\\s]+");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if (!bannedSet.contains(lowerCaseWord)) {
                int frequency = frequencyMap.getOrDefault(lowerCaseWord, 0);
                frequencyMap.put(word.toLowerCase(), frequency + 1);
            }
        }

        String result = "";
        int usage = 0;
        for (Map.Entry<String, Integer> usageEntry : frequencyMap.entrySet()) {
            if (usageEntry.getValue() > usage) {
                result = usageEntry.getKey();
                usage = usageEntry.getValue();
            }
        }
        return result;
    }

}
