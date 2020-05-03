package com.company.Contest187;

import java.util.Stack;

public class Problem2 {
    public boolean kLengthApart(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                if (stack.empty()) {
                    stack.push(i);
                    continue;
                }
                int prev = stack.peek();
                if (i - prev < k + 1) {
                    return false;
                }
                stack.push(i);
            }
        }
        return true;
    }
}
