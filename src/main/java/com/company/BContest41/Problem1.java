package com.company.BContest41;

import java.util.*;

public class Problem1 {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words) {
            if(areSame(count(allowed), count(word))) counter++;
        }
        return counter;
    }

    private Set<Character> count(String word) {
        Set<Character> counter = new HashSet<>();
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            counter.add(aChar);
        }
        return counter;
    }

    private boolean areSame(Set<Character> set1, Set<Character> set2) {
        for (Character character : set2) {
            if(!set1.contains(character)) return false;
        }

        return true;
    }
}
