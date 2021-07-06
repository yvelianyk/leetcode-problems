package com.company.AugustLeetcodeChallenge;

import com.company.LinkedListCycleII142.ListNode;

import java.util.Stack;

public class ReorderLinkedList {
    public void reorderList(ListNode head) {
        if (head == null) return;
        ListNode copyHead = head;
        ListNode node = head;
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        int counter = 0;
        node = head;
        copyHead = copyHead.next;
        boolean getFromFront = true;
        int size = stack.size();
        while (counter < size) {
            counter++;
            if (getFromFront) {
                node.next = stack.pop();
            } else {
                node.next = copyHead;
                copyHead = copyHead.next;
            }
            node = node.next;
            getFromFront = !getFromFront;
        }
        node.next = null;
    }


}
