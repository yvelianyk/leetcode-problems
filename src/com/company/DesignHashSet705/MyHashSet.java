package com.company.DesignHashSet705;

public class MyHashSet {
    private int STORAGE_LENGTH = 10;
    private ListNode[] storage;

    /** Initialize your data structure here. */
    public MyHashSet() {
        storage = new ListNode[STORAGE_LENGTH];
    }

    public void add(int key) {
        int index = hashFunction(key);
        ListNode item = storage[index];
        if (item == null) {
            storage[index] = new ListNode(key);
        } else {
            ListNode node = item;
            while (node.next != null) {
                if(node.val == key) return;
                node = node.next;
            }
            if(node.val == key) return;
            node.next = new ListNode(key);
        }
    }

    public void remove(int key) {
        int index = hashFunction(key);
        ListNode item = storage[index];
        if (item == null) {
            return;
        } else {
            ListNode node = item;
            ListNode prev = item;
            while (node != null) {
                if(node.val == key) {
                    prev.next = node.next;
                } else {
                    prev = node;
                }
                node = node.next;
            }
            if(item.val == key) item = item.next;
            storage[index] = item;
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = hashFunction(key);
        ListNode item = storage[index];
        if (item == null) {
            return false;
        } else {
            ListNode node = item;
            while (node != null) {
                if (node.val == key) return true;
                node = node.next;
            }
        }
        return false;
    }

    private int hashFunction(int key) {
        return key % STORAGE_LENGTH;
    }

    class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
