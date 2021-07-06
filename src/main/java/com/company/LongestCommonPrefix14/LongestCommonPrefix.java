package com.company.LongestCommonPrefix14;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int minLength = strs[0].length();
        for(int i = 0; i < strs.length; i++) {
            int length = strs[i].length();
            if(length <= minLength) minLength = length;
        }

        boolean isCommon = true;
        for(int i = 0; i < minLength && isCommon; i++) {
            char symbol = strs[0].charAt(i);
            for(int j = 1; j < strs.length && isCommon; j++)
                isCommon = isCommon && symbol == strs[j].charAt(i);
            if (isCommon) sb.append(symbol);
        }

        return sb.toString();
    }
}
