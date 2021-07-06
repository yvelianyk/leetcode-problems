package com.company.DeleteNodeInLinkedList237;

import com.company.LinkedListCycleII142.ListNode;

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        int newVal = node.next.val;
        ListNode next = node.next.next;
        node.val = newVal;
        node.next = next;
    }
}
