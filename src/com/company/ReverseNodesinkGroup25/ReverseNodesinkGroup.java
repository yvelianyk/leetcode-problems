package com.company.ReverseNodesinkGroup25;

import com.company.LinkedListCycleII142.ListNode;

public class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = dummy.next;
        ListNode prev = dummy;

        int count = count(head);
        int numOfReverses = count / k;

        for (int i = 0; i < numOfReverses; i++) {
            ListNode next = getKth(node, k + 1);
            ListNode reversed = reverseInK(node, 1, k);
            prev.next = reversed;
            ListNode lastReversed = getKth(reversed, k);
            lastReversed.next = next;
            prev = node;
            node = lastReversed.next;
        }
        return dummy.next;
    }

    private ListNode reverseInK(ListNode node, int counter, int k) {
        if (k == counter) {
            return node;
        }
        ListNode head = reverseInK(node.next, counter + 1, k);
        node.next.next = node;
        node.next = null;
        return head;
    }

    private ListNode getKth(ListNode node, int k) {
        ListNode temp = node;
        int counter = 0;
        while(counter < k - 1 && temp != null) {
            temp = temp.next;
            counter++;
        }
        return temp;
    }

    private int count(ListNode node) {
        ListNode temp = node;
        int counter = 0;
        while( temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }
}
