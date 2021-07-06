package com.company.LRUCache146;

import java.util.HashMap;
import java.util.Map;


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 *
 * put and get operations should have O(1) time complexity
 */
public class LRUCache {

    private int capacity;
    private Map<Integer, DoublyLinkedNode> cache;
    private DoublyLinkedNode dummyHead;
    private DoublyLinkedNode dummyTail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        initDummies();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        DoublyLinkedNode node = cache.get(key);
        removeItself(node);
        putInHead(node);
        return node.val;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DoublyLinkedNode node = cache.get(key);
            node.val = value;
            removeItself(node);
            putInHead(node);
            return;
        }
        if (this.capacity == this.cache.size()) {
            removeLast();
        }
        DoublyLinkedNode newNode = new DoublyLinkedNode(key, value);
        this.cache.put(key, newNode);
        putInHead(newNode);
    }

    private void removeItself(DoublyLinkedNode node) {
        DoublyLinkedNode prev = node.prev;
        DoublyLinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void removeLast() {
        DoublyLinkedNode last = this.dummyTail.prev;
        DoublyLinkedNode beforeLast = last.prev;
        beforeLast.next = this.dummyTail;
        this.dummyTail.prev = beforeLast;
        cache.remove(last.key);
    }

    private void putInHead(DoublyLinkedNode newNode) {
        DoublyLinkedNode prevHead = this.dummyHead.next;
        prevHead.prev = newNode;
        this.dummyHead.next = newNode;
        newNode.prev = this.dummyHead;
        newNode.next = prevHead;
    }

    private class DoublyLinkedNode {
        public int val;
        public int key;
        public DoublyLinkedNode prev, next;

        DoublyLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private void initDummies() {
        this.dummyHead = new DoublyLinkedNode(-11, -11);
        this.dummyTail = new DoublyLinkedNode(-22, -22);
        this.dummyHead.next = this.dummyTail;
        this.dummyTail.prev = this.dummyHead;
    }
}
