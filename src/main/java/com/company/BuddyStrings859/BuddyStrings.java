package com.company.BuddyStrings859;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        char[] aArr = A.toCharArray();
        char[] bArr = B.toCharArray();
        ArrayList<Character> aDiff = new ArrayList<Character>();
        ArrayList<Character> bDiff = new ArrayList<Character>();

        if(A.equals(B)) {
            Map<Character,Integer> stringMap = new HashMap<Character,Integer>();
            for (int i = 0; i < aArr.length; i++) {
                if (stringMap.containsKey(aArr[i])) {
                    int number = stringMap.get(aArr[i]);
                    stringMap.put(aArr[i], ++number);
                } else {
                    stringMap.put(aArr[i], 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : stringMap.entrySet()) {
                if (entry.getValue() >= 2) return true;
            }
            return false;
        } else {
            for (int i = 0; i < aArr.length; i++) {
                if (aArr[i] != bArr[i]) {
                    aDiff.add(aArr[i]);
                    bDiff.add(bArr[i]);
                }
            }
            if (aDiff.size() > 2) return false;
            return aDiff.get(0) == bDiff.get(1) && aDiff.get(1) == bDiff.get(0);
        }


    }
}
