package com.company.MockInterviews.AMockInterviews.Mock01032020;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
public class Problem1 {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsMap = new HashMap<>();

        char[] charArray = chars.toCharArray();
        for (char c : charArray) {
            int count = charsMap.getOrDefault(c, 0);
            charsMap.put(c, count + 1);
        }

        int result = 0;

        for (String word : words) {
            char[] chars1 = word.toCharArray();
            if (check(chars1, charsMap)) {
                result += chars1.length;
            }
        }
        return result;
    }

    private boolean check(char[] chars, Map<Character, Integer> map) {
        Map<Character, Integer> charsMap = new HashMap<>();

        for (char aChar : chars) {
            int count = charsMap.getOrDefault(aChar, 0);
            charsMap.put(aChar, count + 1);
        }

        for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
            if(map.containsKey(entry.getKey())) {
                int count = entry.getValue();
                int mapCount = map.get(entry.getKey());
                if(count > mapCount) return false;
            } else {
                return false;
            }
        }

        return true;
    }
}
