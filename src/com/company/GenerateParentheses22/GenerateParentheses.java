package com.company.GenerateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            result.add("()");
            return result;
        }
        if (n == 0) {
            result.add("");
            return result;
        }
        generate(n - 1, n, "(");
        return result;
    }

    private void generate(int open, int close, String res) {
        StringBuilder sb = new StringBuilder(res);
        if (open > close) return;

        if (open == 0 && close == 2) {
            sb.append("))");
            result.add(sb.toString());
            return;
        }

        if (open == 1 && close == 1) {
            sb.append("()");
            result.add(sb.toString());
            return;
        }

        if (open > 0) {
            generate(open - 1, close, sb + "(");
        }
        if (close > 0) {
            generate(open, close - 1, sb + ")");
        }
    }
}
