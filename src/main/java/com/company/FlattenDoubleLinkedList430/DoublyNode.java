package com.company.FlattenDoubleLinkedList430;

public class DoublyNode {
    public int val;
    public DoublyNode prev;
    public DoublyNode next;
    public DoublyNode child;

    public DoublyNode() {
    }

    public DoublyNode(int _val, DoublyNode _prev, DoublyNode _next, DoublyNode _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}
