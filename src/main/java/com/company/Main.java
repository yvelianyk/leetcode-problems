package com.company;

import com.company.AugustLeetcodeChallenge.ReorderLinkedList;
import com.company.LinkedListCycleII142.ListNode;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReorderLinkedList solution = new ReorderLinkedList();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        solution.reorderList(head);
        System.out.println(head);
    }
}
