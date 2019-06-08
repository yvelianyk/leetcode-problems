package com.company.ReverseLinkedList206;

import com.company.LinkedListCycleII142.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode node = head;
        while(node.next != null) {
            ListNode next = node.next;
            node.next = next.next;
            next.next = head;
            head = next;
        }
        return head;
    }




// RECURSIVELLY
//    private ListNode head;
//
//    public ListNode reverseList(ListNode head) {
//        if(head == null) return null;
//        if(head.next == null) return head;
//        this.head = head;
//        traverse(head);
//        return this.head;
//    }
//
//    private void traverse(ListNode node) {
//        if(node.next == null) return;
//        ListNode next = node.next;
//        node.next = next.next;
//        next.next = head;
//        head = next;
//        traverse(node);
//    }



}
