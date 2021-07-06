package com.company.BalancedStringSplit1221;

import java.util.Stack;

public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char aChar = s.charAt(i);
            if (stack.size() == 0) {
                stack.push(aChar);
                continue;
            }
            char last = stack.peek();
            if (last != aChar) {
                stack.pop();
                if (stack.size() == 0) count++;
                continue;
            }
            stack.push(aChar);
        }
        return count;
    }
}
