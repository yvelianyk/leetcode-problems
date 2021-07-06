package com.company.MinStack155;

import java.util.ArrayList;

public class MinStack {

    private ArrayList<Integer> stack;
    private int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<Integer>();
    }

    public void push(int x) {
        if(x < min) {
            min = x;
        }
        stack.add(x);
    }

    public void pop() {
        int size = stack.size();
        if (size > 0) {
            stack.remove(size - 1);
        }
        reInitMin();
    }

    public int top() {
        int size = stack.size();
        return stack.get(size - 1);
    }

    public int getMin() {
        return min;
    }

    private void reInitMin() {
        min = Integer.MAX_VALUE;
        for (Integer integer : stack) {
            if (integer < min) min = integer;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */