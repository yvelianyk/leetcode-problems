package com.company.DesignCircularQueue622;

public class DesignCircularQueue {
}


class MyCircularQueue {

    private int size;
    private int number = 0;
    private int[] queue;
    private int head = -1;
    private int tail = -1;

    public MyCircularQueue(int k) {
        this.size = k;
        this.queue = new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(head == -1) head = 0;
        tail = (tail + 1) % size;
        queue[tail] = value;
        number++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        head = (head + 1) % size;
        number--;
        return true;
    }

    public int Front() {
        return number == 0 ? -1 : queue[head];
    }

    public int Rear() {
        return number == 0 ? -1 : queue[tail];
    }

    public boolean isEmpty() {
        return number == 0;
    }

    public boolean isFull() {
        return number == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
