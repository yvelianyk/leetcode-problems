package com.company.RemoveAllAdjacentDupllicatesInStringII1209;

public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        int i = 0;
        while (i < s.length()) {
            int count = 0;
            char current = s.charAt(i);
            while (i < s.length() && current == s.charAt(i) && count < k) {
                i++;
                count++;
            }
            if (count == k) {
                return removeDuplicates(s.substring(0, i - k).concat(s.substring(i)), k);
            }
        }
        return s;
    }
}
