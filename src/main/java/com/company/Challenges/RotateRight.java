package com.company.Challenges;

import com.company.LinkedListCycleII142.ListNode;

public class RotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int length = 1;
        ListNode node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }

        int realK = k % length;
        if (realK == 0) return head;

        ListNode node2 = head;
        ListNode node3 = head;
        for (int i = 0; i < realK; i++) node2 = node2.next;
        for (int i = 0; i < length - realK; i++) node3 = node3.next;
        ListNode lastFirst = node3;
        while (lastFirst.next != null) lastFirst = lastFirst.next;
        lastFirst.next = head;
        ListNode lst = node3;
        for (int i = 0; i < length - 1; i++) lst = lst.next;
        lst.next = null;
        return node3;
    }
}
