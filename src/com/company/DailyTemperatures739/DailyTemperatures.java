package com.company.DailyTemperatures739;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = result.length - 1; i >= 0; i--) {
            int elem = T[i];
            while (!stack.empty() && T[stack.peek()] <= elem) stack.pop();
            result[i] = stack.empty() ? 0 : stack.peek() - i;
            stack.push(i);
        }

        return result;
    }
}
