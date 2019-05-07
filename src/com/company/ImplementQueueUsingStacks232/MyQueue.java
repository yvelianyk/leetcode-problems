package com.company.ImplementQueueUsingStacks232;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> firstStack;
    private Stack<Integer> ordered;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.firstStack = new Stack<Integer>();
        this.ordered = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (firstStack.isEmpty() && ordered.isEmpty()) {
            firstStack.push(x);
            ordered.push(x);
            return;
        }

        if (!ordered.isEmpty()) {
            firstStack = new Stack<>();
            while(!ordered.isEmpty()) {
                this.firstStack.push(ordered.pop());
            }
            firstStack.push(x);
        }

        while(!firstStack.isEmpty()) {
            this.ordered.push(firstStack.pop());
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int elem = ordered.pop();
        if (ordered.isEmpty()) {
            firstStack = new Stack<>();
        }
        return elem;
    }

    /** Get the front element. */
    public int peek() {
        return ordered.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.ordered.isEmpty();
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */