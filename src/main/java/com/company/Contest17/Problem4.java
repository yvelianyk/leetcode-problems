package com.company.Contest17;

import java.util.HashMap;
import java.util.Map;

// TODO:
public class Problem4 {
    public int distinctEchoSubstrings(String text) {
        Map<String, Integer> wordsMap = new HashMap<>();
        int result = 0;
        for (int i = 0; i < text.length() / 2; i++) {
            for (int j = 0; j < text.length(); j = j + i + 1) {
                if(j + i < text.length()) {
                    String sub = text.substring(j, j + i + 1);
                    if(wordsMap.containsKey(sub)) {
                        int index = wordsMap.get(sub);
                        System.out.println(index + sub.length());
                        System.out.println(j - sub.length());
                        if(index + sub.length() == j) {
                            result++;
                        }
                    } else {
                        wordsMap.put(sub, j);
                    }
                }
            }
        }
        return result;
    }

    // private void traverse()
}
