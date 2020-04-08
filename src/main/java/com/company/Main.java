package com.company;

import com.company.LinkedListCycleII142.ListNode;
import com.company.ThirtyDayChellenge.MiddleLinkedList;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MiddleLinkedList solution = new MiddleLinkedList();

        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        ListNode result = solution.middleNode(head);

        System.out.println(result);
    }
}
