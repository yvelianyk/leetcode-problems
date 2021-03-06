package com.company.Challenges;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ShortEncodingWords {

    public int minimumLengthEncoding(String[] words) {
        Set<String> wordSet = new HashSet<>();
        Collections.addAll(wordSet, words);

        // generate and remove suffixes
        for (String word : words) {
            int n = word.length();
            for (int i = n - 1; i >=0 ; i--) {
                String suffix = word.substring(i, n);
                if (suffix.equals(word)) continue;
                wordSet.remove(suffix);
            }
        }
        int result = 0;
        int hashLength = 0;
        for (String s : wordSet) {
            result += s.length();
            hashLength++;
        }
        return result + hashLength;
    }

}
