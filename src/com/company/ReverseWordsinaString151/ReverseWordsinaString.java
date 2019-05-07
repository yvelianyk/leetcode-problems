package com.company.ReverseWordsinaString151;

import java.util.Stack;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        if (s.length() == 1) return s.trim();
        char[] chars = s.toCharArray();
        Stack<String> stack = new Stack<String>();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            boolean isWhitespace = Character.isWhitespace(aChar);
            if (isWhitespace || i == chars.length - 1) {
                int end = i;
                if(!isWhitespace) end++;
                if (counter > 0 || i == end - 1) {
                    System.out.println(s.substring(i - counter, end));
                    stack.push(s.substring(i - counter, end));
                }
                counter = 0;
            } else {
                counter++;
            }
        }

        int wordsLength = stack.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsLength; i++) {
            sb.append(stack.pop());
            if (i != wordsLength - 1) sb.append(' ');
        }

        return sb.toString();
    }
}
