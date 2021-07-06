package com.company.Contest229;

public class Problem1 {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        boolean isW1 = true;
        StringBuilder sb = new StringBuilder();
        while (sb.length() <= word1.length() + word2.length()) {
            if (i == word1.length() && isW1) {
                sb.append(word2.substring(j));
                break;
            }
            if (j == word2.length() && !isW1) {
                sb.append(word1.substring(i));
                break;
            }
            if (isW1) {
                sb.append(word1.charAt(i++));
            } else {
                sb.append(word2.charAt(j++));
            }

            isW1 = !isW1;
        }
        return new String(sb);
    }
}
