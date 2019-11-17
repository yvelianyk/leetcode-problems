package com.company.MinimumRemovetoMakeValidParentheses1249;

import java.util.*;

public class MinimumRemovetoMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> closedBraces = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
             char ch = sb.charAt(i);
             if (ch == '(') {
                 stack.push(i);
             }
             if (ch == ')') {
                 if (stack.size() > 0) {
                     stack.pop();
                 } else {
                     closedBraces.add(i);
                 }
             }
        }

        Set<Integer> indicesToDelete = new HashSet<>();
        if (closedBraces.size() > 0) {
            indicesToDelete.addAll(closedBraces);
        }
        if (stack.size() > 0) {
            while (stack.size() > 0) {
                indicesToDelete.add(stack.pop());
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            if (!indicesToDelete.contains(i)) {
                result.append(sb.charAt(i));
            }
        }

        return new String(result);
    }
}
