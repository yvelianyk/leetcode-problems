package com.company.SwapNodesInPairs24;

import com.company.LinkedListCycleII142.ListNode;

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        temp.next.next = swapPairs(temp.next.next);
        return temp;
    }

}
