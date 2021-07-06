package com.company.BContest40;

import com.company.LinkedListCycleII142.ListNode;

public class Problem2 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int index = 0;
        ListNode start = list1;
        ListNode end = list1;
        while (index < a - 1) {
            start = start.next;
            index++;
        }
        index = 0;
        while (index < b) {
            end = end.next;
            index++;
        }
        ListNode last2 = list2;
        while (last2.next != null) {
            last2 = last2.next;
        }

        last2.next = end.next;
        start.next = list2;
        return list1;
    }
}
