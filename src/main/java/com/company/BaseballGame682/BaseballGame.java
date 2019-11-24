package com.company.BaseballGame682;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            String op = ops[i];
            switch (op) {
                case "+":
                    int temp = stack.pop();
                    int result = stack.peek() + temp;
                    stack.push(temp);
                    stack.push(result);
                    break;
                case "D":
                    int lastValid = stack.peek();
                    stack.push(lastValid * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int result = 0;
        while(!stack.isEmpty()) result += stack.pop();
        return result;
    }
}
