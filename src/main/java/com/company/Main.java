package com.company;

import com.company.ConvertBinaryToDecimalLinkedList1290.ConvertBinaryToDecimalLinkedList;
import com.company.LinkedListCycleII142.ListNode;
import com.company.RottenOranges994.RottenOranges;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ConvertBinaryToDecimalLinkedList solution = new ConvertBinaryToDecimalLinkedList();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        head.next = node1;
        node1.next = node2;

        int result = solution.getDecimalValue(head);
        System.out.println(result);

    }
}
