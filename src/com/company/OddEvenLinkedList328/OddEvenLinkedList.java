package com.company.OddEvenLinkedList328;

import com.company.LinkedListCycleII142.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddRes = odd;
        ListNode evenRes = even;
        ListNode lastOdd = odd;

        while (even != null) {
            ListNode nextOdd = odd.next.next;
            ListNode nextEven = even.next == null ? null : even.next.next;
            odd.next = nextOdd;
            even.next = nextEven;
            lastOdd = odd;
            odd = nextOdd;
            even = nextEven;
        }

        if (odd == null) lastOdd.next = evenRes;
        else odd.next = evenRes;

        return oddRes;
    }

}
