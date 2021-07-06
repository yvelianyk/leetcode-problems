package com.company.MockInterviews.GMockInterviews.Mock14042020;

import java.util.Stack;

public class Problem1 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
             char c = S.charAt(i);
             if(c != '-') sb.append(c);
        }
        Stack<String> stack = new Stack<>();
        int size = sb.length();

        for (int i = size - 1; i >= 0;) {
             int start = i - K + 1;
             if (start < 0) start = 0;
            StringBuilder res = new StringBuilder();
             while (start <= i){
                 res.append(Character.toUpperCase(sb.charAt(start++)));
             }

             stack.push(new String(res));
             i = i - K;
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) {
            res.append(stack.pop());
            if(stack.size() != 0) {
                res.append('-');
            }
        }

        return new String(res);
    }
}
