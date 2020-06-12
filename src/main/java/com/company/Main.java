package com.company;

import com.company.AddTwoNumbersII445.AddTwoNumbersII;
import com.company.CountVowelsPermutation1220.CountVowelsPermutation;
import com.company.LinkedListCycleII142.ListNode;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        AddTwoNumbersII solution = new AddTwoNumbersII();

        ListNode head1 = new ListNode(5);
//        ListNode head2 = new ListNode(2);
//        ListNode head3 = new ListNode(4);
//        ListNode head4 = new ListNode(3);

        ListNode head11 = new ListNode(5);
//        ListNode head22 = new ListNode(6);
//        ListNode head33 = new ListNode(4);
//        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//
//        head11.next = head22;
//        head22.next = head33;

        ListNode result = solution.addTwoNumbers(head1, head11);
        System.out.println(result);
    }
}
