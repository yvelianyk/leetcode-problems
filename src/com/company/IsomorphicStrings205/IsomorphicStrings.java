package com.company.IsomorphicStrings205;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (int i = 0; i < sChars.length; i++) {
            char sChar = sChars[i];
            char tChar = tChars[i];
            if(sToTMap.containsKey(sChar)) {
                if (sToTMap.get(sChar) != tChar) return false;
            } else {
                sToTMap.put(sChar, tChar);
            }
            if(tToSMap.containsKey(tChar)) {
                if (tToSMap.get(tChar) != sChar) return false;
            } else {
                tToSMap.put(tChar, sChar);
            }
        }

        return true;
    }
}
