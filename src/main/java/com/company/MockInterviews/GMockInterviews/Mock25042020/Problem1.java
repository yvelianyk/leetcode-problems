package com.company.MockInterviews.GMockInterviews.Mock25042020;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        List<StringBuilder> primitives = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            sb.append(c);
            if (c == '(') balance++;
            if (c == ')') balance--;
            if (i != 0 && balance == 0) {
                primitives.add(sb);
                sb = new StringBuilder();
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder primitive : primitives) {
            primitive.deleteCharAt(0);
            primitive.deleteCharAt(primitive.length() - 1);
            result.append(primitive);
        }

        return new String(result);
    }
}
