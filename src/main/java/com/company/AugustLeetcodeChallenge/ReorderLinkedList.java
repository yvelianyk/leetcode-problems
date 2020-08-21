package com.company.AugustLeetcodeChallenge;

import com.company.LinkedListCycleII142.ListNode;

// TODO: TRY TO USE STACK
public class ReorderLinkedList {
    public void reorderList(ListNode head) {
        ListNode copy = copyList(head);
        ListNode reversed = reverseList(head);

    }

    private ListNode copyList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = new ListNode(head.val);
        newHead.next = copyList(head.next);
        return newHead;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
