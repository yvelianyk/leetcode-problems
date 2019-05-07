package com.company.EvaluateReversePolishNotation150;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Set<String> operands = new HashSet<String>();
        operands.add("+");
        operands.add("-");
        operands.add("*");
        operands.add("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0, l = tokens.length; i < l; i++) {
            String token = tokens[i];
            if(operands.contains(token)) {
                int right = Integer.parseInt(stack.pop());
                int left = Integer.parseInt(stack.pop());
                int result = operation(token, left, right);
                stack.push(Integer.toString(result));
            } else {
                stack.push(token);
            }
        }

        return Integer.parseInt(stack.peek());
    }

    private int operation(String operand, int left, int right) {
        int result = 0;
        switch (operand) {
            case "+":
                result = left + right;
                break;
            case "-":
                result = left - right;
                break;
            case "/":
                result = (int)left / right;
                break;
            case "*":
                result = left * right;
                break;
        }
        return result;
    }
}
