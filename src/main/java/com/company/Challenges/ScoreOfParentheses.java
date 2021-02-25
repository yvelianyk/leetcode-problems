package com.company.Challenges;

import java.util.ArrayList;
import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        char[] chars = S.toCharArray();
        Stack<String> stack = new Stack<>();
        int result = 0;
        for (char ch : chars) {
            if (ch == '(') {
                stack.push(String.valueOf(ch));
                continue;
            }
            String last = stack.pop();
            if (!last.equals("(")) {
                int currSum = 0;
                while (!last.equals("(")) {
                    currSum += Integer.parseInt(last);
                    last = stack.pop();
                }
                stack.push(String.valueOf(2 * currSum));
            } else {
                stack.push("1");
            }

        }
        while (!stack.isEmpty()) {
            result +=Integer.parseInt(String.valueOf(stack.pop())) ;
        }
       return result;

    }
}
