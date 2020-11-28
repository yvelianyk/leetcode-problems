package com.company.BContest40;

import java.util.LinkedList;

public class FrontMiddleBackQueue {
    LinkedList<Integer> list;

    public FrontMiddleBackQueue() {
        list = new LinkedList<>();
    }

    public void pushFront(int val) {
        list.addFirst(val);
    }

    public void pushMiddle(int val) {
        int mid = (list.size() - 1) / 2;
        list.add(list.size() / 2, val);
    }

    public void pushBack(int val) {
        list.addLast(val);
    }

    public int popFront() {
        if (list.size() == 0) return -1;
        return list.removeFirst();
    }

    public int popMiddle() {
        if (list.size() == 0) return -1;
        int mid = (list.size() - 1) / 2;
        return list.remove(mid);
    }

    public int popBack() {
        if (list.size() == 0) return -1;
        return list.removeLast();
    }
}
