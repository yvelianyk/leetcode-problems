package com.company.RemoveLinkedListElements203;

import com.company.LinkedListCycleII142.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode node = head;
        ListNode prev = head;
        while (node != null) {
            if(node.val == val) {
                prev.next = node.next;
                node = node.next;
            } else {
                ListNode temp = prev.next;
                prev = node;
                node = temp;
            }
        }

        if (head.val == val) head = head.next;

        return head;
    }

}
