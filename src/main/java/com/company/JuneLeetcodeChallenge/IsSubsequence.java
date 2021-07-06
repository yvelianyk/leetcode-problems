package com.company.JuneLeetcodeChallenge;

import java.util.Stack;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();
        if (s.length() == 0) return true;
        char[] chars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) stack.push(chars[i]);
        for (char tChar : tChars) {
            if (stack.size() == 0) return true;
            if (stack.peek() == tChar) stack.pop();
        }
        return stack.size() == 0;
    }
}
