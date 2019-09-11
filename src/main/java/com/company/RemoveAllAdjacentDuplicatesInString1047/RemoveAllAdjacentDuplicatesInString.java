package com.company.RemoveAllAdjacentDuplicatesInString1047;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if(!stack.isEmpty()) {
                char stackChar = stack.peek();
                if (currentChar == stackChar) {
                    stack.pop();
                } else {
                    stack.push(currentChar);
                }
            } else {
                stack.push(currentChar);
            }
        }

        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return new String(result);
    }
}
