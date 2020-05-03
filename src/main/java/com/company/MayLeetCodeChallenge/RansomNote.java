package com.company.MayLeetCodeChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> availble = new HashMap<>();
        char[] charsMag = magazine.toCharArray();
        for (char c : charsMag) {
            availble.put(c, availble.getOrDefault(c, 0) + 1);
        }
        char[] ransomChars = ransomNote.toCharArray();
        for (char ransomChar : ransomChars) {

            if(!availble.containsKey(ransomChar) || availble.get(ransomChar) == 0) {
                return false;
            } else {
                availble.put(ransomChar, availble.get(ransomChar) - 1);
            }
        }
        return true;
    }
}
