package com.company.BContest24;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Problem3 {

    private String result;
    private int counter;

    public String getHappyString(int n, int k) {
        result = "";
        permute(0, n,  new StringBuilder(), k);
        return result;
    }

    private void permute(int index, int n, StringBuilder s, int k){
        if (result.length() > 0) return;
        if (index == n) {
            if (++counter == k) result = new String(s);
            return;
        }

        for (char i = 'a'; i <= 'c'; i++) {
             if (s.length() == 0 || s.charAt(index - 1) != i) {
                 permute(index + 1, n, s.append(i), k);
                 s.deleteCharAt(index);
             }
        }
    }

}
