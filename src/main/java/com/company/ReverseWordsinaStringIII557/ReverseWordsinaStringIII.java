package com.company.ReverseWordsinaStringIII557;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsinaStringIII {
    public String reverseWordsIII(String s) {
        char[] chars = s.toCharArray();
        List<Integer> spaces = new ArrayList<Integer>();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isWhitespace(chars[i])) spaces.add(i);
        }

        String[] words = new String[spaces.size() + 1];
        int prev = 0;
        for (int i = 0; i < spaces.size(); i++) {
            String word = s.substring(prev, spaces.get(i));
            words[i] = word;
            prev = spaces.get(i) + 1;
        }

        String lastWord = s.substring(prev, s.length());
        words[spaces.size()] = lastWord;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            sb.append(reverseStr(word));
            if(i != words.length - 1) sb.append(" ");
        }

        return sb.toString();
    }

    private String reverseStr(String s) {
        char[] chars = s.toCharArray();
        int last = chars.length - 1;
        int first = 0;
        while (first < last) {
            char temp = chars[last];
            chars[last] = chars[first];
            chars[first] = temp;
            first++;
            last--;
        }
        return new String(chars);
    }


}
