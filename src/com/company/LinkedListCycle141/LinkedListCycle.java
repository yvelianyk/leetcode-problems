package com.company.LinkedListCycle141;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null || head.next.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow.next != null) {
            if (slow == fast) return true;
            if (fast.next == null || fast.next.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
