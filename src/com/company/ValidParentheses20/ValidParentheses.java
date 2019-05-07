package com.company.ValidParentheses20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        char[] charArray = s.toCharArray();
        Stack stack = new Stack();

        Map<Character, Character> open = new HashMap<Character, Character>();
        open.put('{', '}');
        open.put('(', ')');
        open.put('[', ']');

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if(open.containsKey(currentChar)) {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) return false;
                char last = (Character) stack.pop();
                if(open.get(last) != currentChar) return false;
            }
        }

        return stack.size() == 0;

    }
}
