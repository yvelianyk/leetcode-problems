package com.company.MaxNumbersOfBalloons1189;

import java.util.HashMap;
import java.util.Map;

public class MaxNumbersOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> dict = new HashMap<>();
        Map<Character, Integer> textDict = new HashMap<>();
        String target = "balloon";

        for (int i = 0; i < target.length(); i++) {
            int number = dict.getOrDefault(target.charAt(i), 0);
            dict.put(target.charAt(i), ++number);
        }

        for (int i = 0; i < text.length(); i++) {
            int number = textDict.getOrDefault(text.charAt(i), 0);
            if(dict.containsKey(text.charAt(i))) {
                textDict.put(text.charAt(i), ++number);
            }
        }

        if(dict.size() != textDict.size()) return 0;

        int count = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
            int dictValue = entry.getValue();
            char dictKey = entry.getKey();
            int textDictValue = textDict.get(dictKey);
            count = Math.min(count, textDictValue / dictValue);
        }

        return count;
    }
}
