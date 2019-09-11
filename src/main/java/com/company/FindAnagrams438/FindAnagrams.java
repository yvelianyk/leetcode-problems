package com.company.FindAnagrams438;

import java.util.ArrayList;
import java.util.List;

public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();

        int[] map = new int[26];
        for (int i = 0; i< p.length(); i++) map[p.charAt(i) - 'a']++;

        for (int i = 0; i <= s.length() - p.length(); i++) {
            boolean isAnagram = true;
            int[] clonedMap = map.clone();
            for (int j = 0; j < p.length(); j++) {
                isAnagram = isAnagram && (clonedMap[s.charAt(i + j) - 'a']-- > 0);
            }
            if(isAnagram) result.add(i);
        }

        return result;
    }
}
