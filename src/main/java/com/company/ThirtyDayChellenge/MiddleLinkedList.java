package com.company.ThirtyDayChellenge;

import com.company.LinkedListCycleII142.ListNode;

import java.util.HashMap;
import java.util.Map;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode node = head;
        int count = 0;
        while (node != null) {
            map.put(count++, node);
            node = node.next;
        }
        return map.get(map.size() / 2);
    }
}
