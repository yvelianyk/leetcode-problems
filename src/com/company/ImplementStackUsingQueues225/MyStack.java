package com.company.ImplementStackUsingQueues225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> ordereQueue;

    /** Initialize your data structure here. */
    public MyStack() {
        ordereQueue = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (ordereQueue.isEmpty()) {
            ordereQueue.add(x);
            return;
        }
        Queue queue = new LinkedList<Integer>();
        queue.add(x);
        while (!ordereQueue.isEmpty()) {
            queue.add(ordereQueue.poll());
        }

        ordereQueue = queue;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return ordereQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        return ordereQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return ordereQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
