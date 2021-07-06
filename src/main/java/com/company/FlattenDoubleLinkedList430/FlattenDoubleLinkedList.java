package com.company.FlattenDoubleLinkedList430;

public class FlattenDoubleLinkedList {
    public DoublyNode flatten(DoublyNode head) {
        if (head == null) return null;
        DoublyNode node = head;
        while (node != null) {
            if (node.child != null) {
                DoublyNode lastChild = getLast(node.child);
                connect(node, lastChild);
            }
            node = node.next;
        }
        return head;
    }

    private DoublyNode getLast(DoublyNode node) {
        DoublyNode temp = node;
        while (temp.next != null) temp = temp.next;
        return temp;
    }

    private void connect(DoublyNode left, DoublyNode right) {
        DoublyNode leftNext = left.next;
        DoublyNode child = left.child;

        left.next = child;
        child.prev = left;
        if (leftNext != null) {
            leftNext.prev = right;
            right.next = leftNext;
        }
        left.child = null;
    }
}

