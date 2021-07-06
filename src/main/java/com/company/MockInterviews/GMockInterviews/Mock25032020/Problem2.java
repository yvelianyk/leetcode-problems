package com.company.MockInterviews.GMockInterviews.Mock25032020;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public boolean isLongPressedName(String name, String typed) {
        List<int[]> encodedName = encode(name);
        List<int[]> encodedTyped = encode(typed);
        if (encodedName.size() != encodedTyped.size()) return false;

        for (int i = 0; i < encodedName.size(); i++) {
             int[] encName = encodedName.get(i);
             int[] encTyped = encodedTyped.get(i);
             if (encName[0] != encTyped[0]) return false;
             if (encTyped[1] < encName[1]) return false;
        }

        return true;
    }

    private List<int[]> encode(String string) {
        List<int[]> encoded = new ArrayList<>();
        for (int i = 0; i < string.length();) {
             char ch = string.charAt(i);
             char next = ch;
             int counter = 0;
             while (ch == next) {
                 counter++;
                 if (++i == string.length()) break;
                 next = string.charAt(i);
             }
            encoded.add(new int[]{(int) ch, counter});
        }
        return encoded;
    }
}
