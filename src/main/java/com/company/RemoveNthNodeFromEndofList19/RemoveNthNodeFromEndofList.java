package com.company.RemoveNthNodeFromEndofList19;

import com.company.LinkedListCycleII142.ListNode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = getFast(slow, n);
        if (fast == null) return slow.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = getFast(slow, n);
        }

        slow.next = slow.next.next;
        return head;
    }

    private ListNode getFast(ListNode head, int n) {
        ListNode node = head;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return node;
    }
}
