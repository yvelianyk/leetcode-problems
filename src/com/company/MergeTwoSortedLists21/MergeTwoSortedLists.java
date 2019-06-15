package com.company.MergeTwoSortedLists21;

import com.company.LinkedListCycleII142.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        if (head1.val <= head2.val) {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeTwoLists(head2.next, head1);
            return head2;
        }
    }

}
