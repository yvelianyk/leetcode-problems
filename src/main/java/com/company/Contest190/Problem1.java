package com.company.Contest190;

public class Problem1 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.startsWith(searchWord)) return i + 1;
        }
        return -1;
    }
}
