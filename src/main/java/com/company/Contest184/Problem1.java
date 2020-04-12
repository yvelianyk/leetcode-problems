package com.company.Contest184;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1 {
    public List<String> stringMatching(String[] words) {
        Set<String> resSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = i; j < words.length; j++) {
                String s = words[j];
                if (!word.equals(s)) {
                    if (word.contains(s)) {
                        resSet.add(s);
                    }
                    if(s.contains(word)) {
                        resSet.add(word);
                    }
                }
            }
        }

        return new ArrayList<>(resSet);
    }
}
