package com.company.Challenges;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int poppedIndex = 0;
        Stack<Integer> stack = new Stack<>();
        for (int j : pushed) {
            stack.push(j);
            if (j == popped[poppedIndex]) {
                stack.pop();
                poppedIndex++;
                if (stack.isEmpty()) continue;
                int last = stack.peek();
                int next = popped[poppedIndex];
                while (last == next) {
                    stack.pop();
                    poppedIndex++;
                    if (stack.isEmpty()) break;
                    last = stack.peek();
                    next = popped[poppedIndex];
                }
            }
        }
        return stack.isEmpty();
    }
}
