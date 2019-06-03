package com.company.DesignLinkedList707;

public class MyLinkedList {

    private LinkedListNode head;

    /** Initialize your data structure here. */
    public MyLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int counter = 0;
        if(head == null) return -1;
        LinkedListNode node = head;
        while (node != null) {
            if(counter++ == index) {
                return node.val;
            }
            node = node.next;
        }
        return -1;

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        LinkedListNode node = new LinkedListNode(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        LinkedListNode newNode = new LinkedListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        LinkedListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            addAtHead(val);
            return;
        }
        LinkedListNode newNode = new LinkedListNode(val);
        if (head == null) {
            if (index == 0) {
                head = newNode;
            }
            return;
        }

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        int counter = 0;
        LinkedListNode node = head;
        while (node.next != null) {
            if (counter++ == index - 1) {
                newNode.next = node.next;
                node.next = newNode;
                break;
            }
            node = node.next;
        }
        if (index - 1 == counter) {
            node.next = newNode;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (head == null) return;
        if (index == 0) {
            if (head.next == null) {
                head = null;
                return;
            }
            head = head.next;
        }


        int counter = 0;
        LinkedListNode node = head;
        while (node.next != null) {
            if (counter++ == index - 1) {
                if(node.next.next != null) {
                    node.next = node.next.next;
                } else {
                    node.next = null;
                }
                break;
            }
            node = node.next;
        }
    }

    class LinkedListNode {
        public int val;
        public LinkedListNode next;
        LinkedListNode(int val) {
            this.val = val;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */