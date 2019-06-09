package com.company.DesignHashMap706;

public class MyHashMap {

    private int STORAGE_LENGTH = 10000;
    private ListNode[] storage;

    /** Initialize your data structure here. */
    public MyHashMap() {
        storage = new ListNode[STORAGE_LENGTH];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = hashFunction(key);
        ListNode item = storage[index];
        if (item == null) {
            storage[index] = new ListNode(key, value);
            return;
        }
        ListNode node = item;
        while (node.next != null) {
            if(node.key == key) {
                node.val = value;
                return;
            }
            node = node.next;
        }
        if(node.key == key) {
            node.val = value;
            return;
        }
        node.next = new ListNode(key, value);
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = hashFunction(key);
        ListNode item = storage[index];
        if (item == null) {
            return -1;
        }
        ListNode node = item;
        while (node != null) {
            if (node.key == key) return node.val;
            node = node.next;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = hashFunction(key);
        ListNode item = storage[index];
        if (item == null) {
            return;
        } else {
            ListNode node = item;
            ListNode prev = item;
            while (node != null) {
                if(node.key == key) {
                    prev.next = node.next;
                } else {
                    prev = node;
                }
                node = node.next;
            }
            if(item.key == key) item = item.next;
            storage[index] = item;
        }
    }

    private int hashFunction(int key) {
        return key % STORAGE_LENGTH;
    }

    class ListNode {
        public int key;
        public int val;
        public ListNode next;

        public ListNode(int x, int val) {
            this.key = x;
            this.val = val;
            this.next = null;
        }
    }
}
