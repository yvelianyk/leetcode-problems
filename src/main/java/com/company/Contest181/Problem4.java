package com.company.Contest181;

public class Problem4 {
    public String longestPrefix(String s) {
        int length = s.length();
        if (length == 1) return "";
        int[] table = new int[length];
        int i = 0;
        int j = 1;
        while (j < length) {
            if(s.charAt(i) != s.charAt(j)) {
                if (i > 0) {
                    i = table[i - 1];
                } else {
                    table[j] = 0;
                    j++;
                }
            } else {
                table[j] = i + 1;
                i++;
                j++;
            }
        }

        return s.substring(0, table[length - 1]);
    }
}
