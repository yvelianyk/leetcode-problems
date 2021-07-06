package com.company.ReverseLinkedList206;

import com.company.LinkedListCycleII142.ListNode;

public class ReverseLinkedList {

    // ITERATIVELLY:
    //    public ListNode reverseList(ListNode head) {
//        if(head == null) return null;
//        if(head.next == null) return head;
//        ListNode node = head;
//        while(node.next != null) {
//            ListNode next = node.next;
//            node.next = next.next;
//            next.next = head;
//            head = next;
//        }
//        return head;
//    }




// RECURSIVELLY


    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }



}
