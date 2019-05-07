package com.company.PlusOne66;

import java.util.Stack;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<Integer>();
        int carry = 0;

        for(int i = digits.length - 1; i >= 0; i--) {
            int one = i == digits.length - 1 ? 1 : 0;
            int sum = digits[i] + carry + one;
            if (sum > 9) {
                carry = 1;
                stack.push(0);
            } else {
                carry = 0;
                stack.push(sum);
            }
        }

        if (carry == 1) stack.push(1);
        int size = stack.size();
        int[] result = new int[size];
        for(int j = 0; j < size; j++) result[j] = stack.pop();

        return result;
    }
}
