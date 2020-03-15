package com.company.Contest180;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {

    private List<Integer> array;
    private int maxSize;
    private int size;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        array = new ArrayList<>();
    }

    public void push(int x) {
        if (size < maxSize) {
            array.add(x);
            size++;
        }
    }

    public int pop() {
        if (size == 0) return -1;
        int last = array.get(size - 1);
        array.remove(size - 1);
        size--;
        return last;
    }

    public void increment(int k, int val) {
        int loopCount = Math.min(k, size);
        if (loopCount == 0) return;
        int index = 0;
        while (loopCount > 0) {
            int curr = array.get(index);
            array.set(index++, val + curr);
            loopCount--;
        }
    }
}
