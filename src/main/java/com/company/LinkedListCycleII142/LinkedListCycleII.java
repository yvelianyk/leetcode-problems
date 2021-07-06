package com.company.LinkedListCycleII142;


public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        do {
            slow = slow.next;
            if(fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
        } while(slow != fast);

        slow = slow;
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    private boolean isInCycle(ListNode target, ListNode cycleNode) {
        ListNode node = cycleNode.next;

        while (node != cycleNode) {
            if (node == target) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    private ListNode getFromCycle(ListNode head) {
        if (head == null) return null;
        if (head.next == null || head.next.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow.next != null) {
            if (slow == fast) return fast;
            if (fast.next == null || fast.next.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return null;
    }

}
