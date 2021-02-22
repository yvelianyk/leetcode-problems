package com.company.Challenges;

import java.util.List;

public class FindLongestWord {
    public String findLongestWord(String s, List<String> d) {
        String result = "";
        for (String dictWord : d) {
           if (isContains(dictWord, s) && dictWord.length() >= result.length()) {
               if (result.length() == dictWord.length()) {
                   result = result.compareTo(dictWord) < 0 ? result : dictWord;
                   continue;
               }
               result = dictWord;
           }
        }
        return result;

    }
    private boolean isContains(String x, String y) {
        int j = 0;
        for (int i = 0; i < y.length() && j < x.length(); i++) {
            if (x.charAt(j) == y.charAt(i)) {
                j++;
            }
        }
        return j == x.length();
    }

}
